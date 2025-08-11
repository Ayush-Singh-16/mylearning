import java.util.Scanner;
public class MethodForFactorial {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    Factorial(num);
   } 
   static void Factorial(int n){
    int sum=1;
    System.out.print(n+"!"+"=");
    for(int i=1;i<=n;i++){
        if(i<n){
        System.out.print(i+"*");
        }
        else{
            System.out.print(i);
        }
        sum*=i;
    }
    if(n!=1&&n!=0){
    System.out.print("=");
    System.out.print(sum);
    }
    else if(n==0){
        System.out.println("1");
    }
}
}
