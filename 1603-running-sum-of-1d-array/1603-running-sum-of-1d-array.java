class Solution {
    public static int[] runningSum(int[] nums) {
        int[] runningSum=new int[nums.length];
        runningSum[0]=nums[0];
       for(int i=1;i<nums.length;i++){
        
            runningSum[i]=nums[i]+runningSum[i-1];
       } 
       return runningSum;
    }
    public static void main(String args[]){
        int[] nums={1,2,3,4};
        System.out.print(Arrays.toString(nums));
    }
}