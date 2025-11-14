class Solution {
    public boolean halvesAreAlike(String s) {
        int a=0,b=0;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
              a++;  
            }
            if(s.charAt(s.length()-i-1)=='a'||s.charAt(s.length()-i-1)=='e'||s.charAt(s.length()-i-1)=='i'||s.charAt(s.length()-i-1)=='o'||s.charAt(s.length()-i-1)=='u'||s.charAt(s.length()-i-1)=='A'||s.charAt(s.length()-i-1)=='E'||s.charAt(s.length()-i-1)=='I'||s.charAt(s.length()-i-1)=='O'||s.charAt(s.length()-i-1)=='U'){
                b++;
            }
        }
        return a==b;
    }
}