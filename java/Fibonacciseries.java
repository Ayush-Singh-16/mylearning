import java.util.Scanner;
public class Fibonacciseries{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum , n;
        System.out.print("Enter the limit:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>=0){
            sum=a;
            a=b;
            b+=sum;
            System.out.print(sum+",");
            n--;
        }
        sc.close();
    }
}