class Solution {
    public int[] findRightInterval(int[][] intervals) {
         int[][] arr=new int[intervals.length][2];
         for(int i=0;i<intervals.length;i++){
            arr[i][1]=intervals[i][0];
            arr[i][0]=i;
         }
         sort(arr);
         int[] index=new int[intervals.length];
         for(int i=0;i<intervals.length;i++){
            index[i]=binarysearch(arr,intervals[i][1]);
         }
         return index;
    }
    int binarysearch(int[][] arr, int target){
        int start=0,end=arr.length-1;
        int temp=-1;
        int x=arr[arr.length-1][1];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid][1]>=target && arr[mid][1]<=x){
                temp=arr[mid][0];
                x=arr[mid][1];
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return temp;
    }
    void sort(int[][] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j][1]>arr[j-1][1]){
                    break;
                }
                else{
                    int[] temp={arr[j][0],arr[j][1]};
                    arr[j][0]=arr[j-1][0];
                    arr[j][1]=arr[j-1][1];
                    arr[j-1][0]=temp[0];
                    arr[j-1][1]=temp[1];
                }
            }
        }
    }
}