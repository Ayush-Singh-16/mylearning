class Solution {
    public int missingNumber(int[] nums) {
        cyclicsort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
    public void cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int index=arr[i];
            if(index <arr.length && arr[i]!=arr[index]){
                swap(arr,index,i);
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