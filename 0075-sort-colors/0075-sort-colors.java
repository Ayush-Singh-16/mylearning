class Solution {
    public void sortColors(int[] nums) {
        dutchsort(nums);
    }
    void dutchsort(int[] arr){
        int start=0,mid=0,end=arr.length-1;
        while(mid<=end){
            if(arr[mid]==2){
                swap(arr,mid,end);
                end--;
            }
            else if(arr[mid]==0){
                swap(arr,start,mid);
                start++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
    void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}