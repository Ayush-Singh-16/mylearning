class Solution {
    public static int[] runningSum(int[] nums) {
        int[] runningSum=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        for(int j=0;j<=i;j++){
            runningSum[i]+=nums[j];
        }
       } 
       return runningSum;
    }
    public static void main(String args[]){
        int[] nums={1,2,3,4};
        System.out.print(Arrays.toString(nums));
    }
}