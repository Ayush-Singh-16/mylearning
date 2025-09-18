class Solution {
    public int findDuplicate(int[] nums) {
        cyclicsort(nums);
       int start=0,end=nums.length-1;
       while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]!=mid+1){
            return nums[mid];
        }
        else if(nums[mid]==mid+1){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
       }
        return start;
    }
    void cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int index=arr[i]-1;
            if(arr[i]!=arr[index]){
                swap(arr,i,index);
            }
            else{
                i++;
            }
        }
    }
    void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}