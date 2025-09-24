class Solution {
    public void rotate(int[] nums, int k) {
        int a=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,a-1);
        reverse(nums,a,nums.length-1);
    }
    void reverse(int[] arr,int start,int end){
        while(start<end){
          int temp=arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
          end--;
          start++;
        }
    }
}