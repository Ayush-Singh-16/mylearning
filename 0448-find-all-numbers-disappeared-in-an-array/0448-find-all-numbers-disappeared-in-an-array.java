class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicsort(nums);
        ArrayList <Integer> List=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                List.add(i+1);
            }
        }
        return List;
    }
   
    void cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int index=arr[i]-1;;
            if(arr[i]!=arr[index]){
                swap(arr,i,index);
            }
            else{
                i++;
            }
        }
    }
    void swap(int[] arr, int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}