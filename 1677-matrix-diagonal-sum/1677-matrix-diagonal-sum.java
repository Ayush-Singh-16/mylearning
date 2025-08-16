class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int a=mat.length-1;
        int b=mat.length-1;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][a];
            sum+=mat[i][i];
            a--;
            b--;
        }
        if(mat.length%2!=0){
        sum-=(mat[mat.length/2][mat.length/2]);
        }
        return sum;
    }
}