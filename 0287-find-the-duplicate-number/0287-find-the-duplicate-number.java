class Solution {
    public int findDuplicate(int[] nums) {
        cyclicsort(nums);
        for(int i=0;i<nums.length;i++){
            if(i+1!=nums[i]){
                return nums[i];
            }
        }
        return nums.length;
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