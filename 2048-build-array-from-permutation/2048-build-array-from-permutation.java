import java.util.Scanner;
class Solution {
    public static int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];      
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
    public static void main(String args[]){
        int[] nums={1,0,3,4,5,2};
        System.out.print(Arrays.toString(buildArray(nums)));
        
    }
}