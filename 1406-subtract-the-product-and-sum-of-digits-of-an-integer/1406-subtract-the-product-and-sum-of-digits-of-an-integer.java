import java.util.Scanner;
class Solution {
    public int subtractProductAndSum(int n) {
       int sum=0, product=1;
       while(n>0) {
        int temp=n%10;
        n/=10;
        product*=temp;
        sum+=temp;
        }
        int result=product-sum;
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        Solution obj=new Solution();
        int result=obj.subtractProductAndSum(num);
        System.out.print(result);
        sc.close();
    }
}