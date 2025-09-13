class Solution {
    public boolean search(int[] nums, int target) {
        int pivot=pivotwithduplicates(nums);
        if(pivot==-1){
           return binarysearch(nums,0,nums.length-1,target);
        }
        else if(nums[pivot]==target){
            return true;
        }
        else if(nums[0]>target){
            return binarysearch(nums,pivot+1,nums.length-1,target);
        }
        else{
        return binarysearch(nums,0,pivot-1,target);
        }
    }
    public boolean binarysearch(int[] arr,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
    public int pivotwithduplicates(int[] arr){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[start]==arr[mid] && arr[end]==arr[mid]){
                if(end>start && arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
                if(start<end && arr[start]>arr[start+1]){
                    return start;
                }
                start++;
            }
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}