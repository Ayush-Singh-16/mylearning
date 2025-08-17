class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        int front=0;
        int rear=n-1;
        if(n>1){
            for(int i=1;i<=n/2;i++){
                arr[front++]=i;
                arr[rear--]=-i;
            }
        }
        if(n%2!=0){
            arr[n/2]=0;
        }
        return arr;
        
    }
}