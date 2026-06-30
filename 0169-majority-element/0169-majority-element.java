
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int current=nums[0];
        for(int num:nums){
            if(current==num){
                count++;
            }
            else if(count==0){
                current=num;
            }
            else{
                count--;
            }
        }
        return current;
    }
}