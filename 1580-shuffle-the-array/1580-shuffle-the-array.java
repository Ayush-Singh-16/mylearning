class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int b=n;
        int c=0;
        for(int i=1;i<=(2*n);i+=2){
            arr[i-1]=nums[c];
            arr[i]=nums[b];
            b++;
            c++;
        }
        return arr;
    }
    public static void main(String args[]){
        int[] nums={2,5,1,3,4,7};
        int n=3;
        System.out.print(Arrays.toString(shuffle(nums,n)));
    }
}