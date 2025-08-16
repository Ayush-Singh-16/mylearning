class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mtx=new int[m][n]; //mtx initiallized all inices value is 0
        int sum=0;
        int row,col;
        for(int i=0;i<indices.length;i++){
            row =indices[i][0];
            col=indices[i][1];
            for(int j=0;j<m;j++){
                mtx[j][col]+=1; //for column updation
            }
            for(int k=0;k<n;k++){
                mtx[row][k]+=1; //for row updation
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((mtx[i][j])%2!=0 && mtx[i][j]!=0){
                    sum++;
                }
            }
        }
        return sum;
    }
}