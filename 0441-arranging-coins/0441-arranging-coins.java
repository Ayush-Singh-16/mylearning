class Solution {
    public int arrangeCoins(int n) {
        int i=1,stc=0;
        while(i<=n){
            stc++;
            n-=i;
            i++;
        }
        return stc;
    }
}