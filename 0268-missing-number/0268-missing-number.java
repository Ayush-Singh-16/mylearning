class Solution {
    public int missingNumber(int[] nums) {
        bubblesort(nums);
         int start=0,end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==mid){
                start=mid+1;
            }
            else{
                end=mid-1;;
            }
        }
        return start;
    }
    public void bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean x=true;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    x=false;
                }
            }
            if(x){
                break;
            }
        }
    }
}