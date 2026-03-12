class Solution {
    public void reverseString(char[] s) {
        helper(s,0);
    }
    void helper(char[] arr ,int i){
        
        if(i==arr.length){
            return;
        }
        char ch=arr[i];
        helper(arr,i+1);
        arr[arr.length-1-i]=ch;
    }
}