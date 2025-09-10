class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int x=1;
        while(x<=nums.length){
            if(x==binarysearch(nums,x)){
                return x;
            }
            x++;
        }
        return -1;
    }
    public int binarysearch(int[] arr,int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
             if(arr[mid]>=target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }     
        }
        return arr.length-end-1;
    }
}