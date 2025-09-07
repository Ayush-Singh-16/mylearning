class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        int num=1;
        while(count<k){
            count+=binarysearch(arr,num);
            num++;
        }
        num--;
        return num;
    }
    public int binarysearch(int[] arr,int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return 0;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return 1;
    }
}