class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer,Integer> hash=new HashMap<>();
        
         for(int i=0;i<nums.length;i++){
            int j=target-nums[i];
            if(hash.containsKey(j) && hash.get(j)!=i){
               return new int[] {i,hash.get(j)};
            }
            hash.put(nums[i],i);
         }
         return new int[] {};
    }
}