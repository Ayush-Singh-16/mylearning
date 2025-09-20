class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        int ini_i=0,ini_j=0;
        int len_i=matrix.length-1,len_j=matrix[0].length-1;
        int n=0, total=matrix.length*matrix[0].length;
        while(n<matrix.length*matrix[0].length){
            for(int j=ini_j;j<=len_j & n<total;j++){
                list.add(matrix[ini_i][j]);
                n++;
            }
            ini_i++;
            for(int i=ini_i;i<=len_i && n<total;i++){
                list.add(matrix[i][len_j]);
                n++;
            }
            len_j--;
            for(int j=len_j;j>=ini_j && n<total;j--){
                list.add(matrix[len_i][j]);
                n++;
            }
            len_i--;
            for(int i=len_i;i>=ini_i && n<total;i--){
                list.add(matrix[i][ini_j]);
                n++;
            }
            ini_j++;
        }
        return list;
    }
}