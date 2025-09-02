class Solution {
    public int mySqrt(int x) {
        long start=0,end=(long)x;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid==(long)x){
                return (int)mid;
            }
            else if(mid*mid>(long)x){
                 end=mid-1;
            }
            else {
                 start=mid+1;
            }
        }
        return (int)end;
      }  
}