class Solution {
    public int[] findErrorNums(int[] nums) {
       cyclicsort(nums);
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=i+1){
            return new int[] {nums[i],i+1};
        }
       }
       return new int[] {-1,-1};
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
    void swap(int[] arr,int i,int index){
        int temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
    }
}