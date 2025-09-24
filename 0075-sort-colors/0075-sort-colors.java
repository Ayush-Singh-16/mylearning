class Solution {
    public void sortColors(int[] nums) {
        int r=0,w=0,b=0,start=0;
        while(start<=nums.length-1){
            if(nums[start]==0){
                r++;
            }
            else if(nums[start]==1){
                w++;
            }
            else{
                b++;
            } 
            start++;
        }
        for(int i=0;i<r;i++){
            nums[i]=0;
        }
        for(int i=r;i<r+w;i++){
            nums[i]=1;
        }
        for(int i=r+w;i<r+w+b;i++){
            nums[i]=2;
        }
    }
}