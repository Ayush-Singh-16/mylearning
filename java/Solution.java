import java.util.Scanner;
class Solution {
      static int  subtractProductAndSum(int n) {
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
        int result=subtractProductAndSum(num);
        System.out.print(result);
        sc.close();
    }
}