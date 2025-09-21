class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] arr=new int[rows*cols][2];
        int ite=1;
        int total=rows*cols,n=0;
        while(n<total){
            for(int i=1;i<=ite && n<total ;i++){
                if(cStart<cols &&cStart>=0 && rStart<rows && rStart >=0){
                  arr[n]=new int[] {rStart,cStart};  
                  n++;
                }
                cStart++;
            }
            for(int i=1;i<=ite && n<total ;i++){
                if(rStart<rows && rStart >=0 && cStart<cols &&cStart>=0){
                     arr[n]=new int[] {rStart,cStart};
                     n++;
                }
                 rStart++;
            }
            ite++;
            for(int i=1;i<=ite && n<total ;i++){
                 if(cStart<cols &&cStart>=0 && rStart<rows && rStart >=0){
                  arr[n]=new int[] {rStart,cStart};  
                  n++;
                }
                cStart--;
            }
             for(int i=1;i<=ite && n<total ;i++){
                if(cStart<cols &&cStart>=0 &&rStart<rows && rStart >=0){
                     arr[n]=new int[] {rStart,cStart};
                     n++;
                }
                 rStart--;
            }
            ite++;
        }
        return arr;
    }
}