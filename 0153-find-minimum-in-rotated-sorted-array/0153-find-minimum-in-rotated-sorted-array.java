class Solution {
    public int findMin(int[] nums) {
        if(findpivot(nums)!=-1){
            return nums[findpivot(nums)+1];
        }
        else{
            return nums[0];
        }
    }

    public int findpivot(int[] arr){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[start]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
