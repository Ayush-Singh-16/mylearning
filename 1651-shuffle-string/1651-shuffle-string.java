class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb=new StringBuilder();
        char[] str=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            str[indices[i]]=s.charAt(i);
        }
        for(int i=0;i<indices.length;i++){
            sb.append(str[i]);
        }
        return sb.toString();
    }
}