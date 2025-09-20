class Solution {
    public int[][] generateMatrix(int n) {
        int ini_i=0,ini_j=0;
        int len_i=n-1,len_j=n-1;
        int[][] arr=new int[n][n];
        int x=1,total=n*n;
        while(x<=total){
             for(int j=ini_j;j<=len_j && x<=total;j++){
            arr[ini_i][j]=x;
            x++;
        }
        ini_i++;
        for(int i=ini_i;i<=len_i && x<=total;i++){
            arr[i][len_j]=x;
            x++;
        }
        len_j--;
        for(int j=len_j;j>=ini_j && x<=total;j--){
            arr[len_i][j]=x;
            x++;
        }
        len_i--;
        for(int i=len_i;i>=ini_i && x<=total;i--){
            arr[i][ini_j]=x;
            x++;
        }
        ini_j++;
        }
        return arr;
    }
    
}