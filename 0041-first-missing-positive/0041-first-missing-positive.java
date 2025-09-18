class Solution {
    public int firstMissingPositive(int[] nums) {
        cyclicsort(nums);
        int i;
        for(i=0;i<nums.length;i++){
             if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
    void cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int index=arr[i]-1;
            if(arr[i]>0  && arr[i]<=arr.length && arr[i]!=arr[index]){
                swap(arr,i,index);
            }
            else{
                i++;
            }
        }
    }
    void swap(int[] arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}