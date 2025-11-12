class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        String[] posi=new String[words.length];
        for(String i : words){
            posi[(i.charAt(i.length()-1))-1-'0']=i;
        }
        StringBuilder sb=new StringBuilder();
        for(String i : posi){
            sb.append(i);
            sb.deleteCharAt(sb.length()-1);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}