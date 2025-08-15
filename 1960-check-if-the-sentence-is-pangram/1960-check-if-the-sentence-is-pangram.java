class Solution {
    public boolean checkIfPangram(String sentence) {
       int len=sentence.length();
       if (len<26){
        return false;
       }
       else{
       char a;
       loop_1:
        for(int i=0;i<sentence.length();i++){
            a=sentence.charAt(i);
           loop_2:
           for(int j=i+1;j<sentence.length();j++){
            if(a==sentence.charAt(j)){
                len--;
                continue loop_1;
            }
           }
          }
          if(len>=26){
            return true;
          }
          else{
            return false;
          }
        }
    }
}