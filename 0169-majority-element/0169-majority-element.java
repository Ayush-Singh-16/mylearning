import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        int[] arr=nums;
        Arrays.sort(arr);
        int mid=arr.length/2;
        return arr[mid];
    }
}