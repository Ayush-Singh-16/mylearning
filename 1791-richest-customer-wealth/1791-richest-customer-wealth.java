class Solution {
    public static int maximumWealth(int[][] accounts) {
        int max=accounts[0][0];
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
                if(max<sum){
                    max=sum;
                }
            }
        }
        return max;
        
    }
    public static void main(String args[]){
        int[][] accounts={{1,2,3},{3,2,1}};
        System.out.print(maximumWealth(accounts));
    }
}