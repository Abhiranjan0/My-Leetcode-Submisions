class Solution {
    public boolean halvesAreAlike(String s) {
      //  StringBuilder st=new StringBuilder(s);
         char[] c={'a','e','i','o','u','A','E','I','O','U'};
         String v=new String(c);
        int av=0;
        int ac=0;
        int bv=0;
        int bc=0;
        for(int i=0;i<s.length();i++) {
            if(i<s.length()/2) {
               if(isVowel(s.charAt(i),v)==true) {
                   av++;
               }
               else{
                   ac++;
               }
            }
            else{
                    if(isVowel(s.charAt(i),v)==true) {
                   bv++;
               }
               else{
                   bc++;
               }
            }
        }
        if(av==bv) {
            if(ac==bc) {
                return true;
            }
            else
            return false;
        }
        else
        return false;
    }
    public boolean isVowel(int n,String v) {
       
        for(int k=0;k<v.length();k++) {
            if(n==v.charAt(k)){
                return true;
            }
        }
        return false;
    }
}
