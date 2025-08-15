class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       int[][] arr=new int[image.length][image.length];
       for(int i=0;i<image.length;i++){
        for(int j=0;j<image.length;j++){
            arr[i][j]=image[i][image.length-1-j];
            if(arr[i][j]==0){
                arr[i][j]=1;
            }
            else {
                arr[i][j]=0;
            }
        }
       }
       
       return arr;
    }
}