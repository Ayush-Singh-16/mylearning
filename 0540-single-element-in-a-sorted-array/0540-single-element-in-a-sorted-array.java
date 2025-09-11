class Solution {
    public int singleNonDuplicate(int[] nums) {
        int x=0;
        while(x<nums.length){
            if(binarysearch(nums,x+1,nums[x])!=1||x+1==nums.length){
                return nums[x];
            }
            x+=2;
        }
        if(nums.length==1){
            return nums[0];
        }
        return -1;
    }
    public int binarysearch(int[] arr, int start, int target){
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return 1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}