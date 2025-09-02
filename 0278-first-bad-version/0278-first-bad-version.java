/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int x=n,start=1, end=n;
        while(start<=end) {
        int mid=start+(end-start)/2;
       if(isBadVersion(mid)){
           x=mid;
           end=mid-1;
           }
        else if(!isBadVersion(mid)){
        start=mid+1;
        }
        } 
        return x;
    }
}