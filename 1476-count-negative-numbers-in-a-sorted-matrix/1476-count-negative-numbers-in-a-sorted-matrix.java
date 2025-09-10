class Solution {
    public int countNegatives(int[][] grid) {
        int sum=0;
        int row=0;
        while(row<grid.length){
            sum+=binarysearch(row,grid);
            row++;
        }
        return sum;
    }
    public int binarysearch(int row,int[][] arr){
        int start=0,end=arr[row].length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[row][mid]>=0){
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            
        }
        
            return (arr[row].length-1-end);
     
    }
}