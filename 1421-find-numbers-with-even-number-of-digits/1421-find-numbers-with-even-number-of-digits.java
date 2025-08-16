class Solution {
    public int findNumbers(int[] nums) {
        int out=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                nums[i]/=10;
                sum++;
            }
            if(sum%2==0){
                out++;
            }
            sum=0;
        }
        return out;
    }
}