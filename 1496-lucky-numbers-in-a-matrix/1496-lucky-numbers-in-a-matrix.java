class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> arr=new ArrayList<>();
        int a;
        int[] col=new int[matrix.length];
        int[] row=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
             a=matrix[i][0];
            for(int j=0;j<matrix[0].length;j++){
                if(a>matrix[i][j]){
                    a=matrix[i][j];
                }
            }
            col[i]=a;
        }
        for(int j=0;j<matrix[0].length;j++){
              a=matrix[0][j];
        for(int i=0;i<matrix.length;i++){
                if(a<matrix[i][j]){
                    a=matrix[i][j];
                }
            }
            row[j]=a;
        }
        loop_1: for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(row[i]==col[j]){
                    arr.add(row[i]);
                   
                    break loop_1;
                }
            }
        }
         return arr;
    }
}