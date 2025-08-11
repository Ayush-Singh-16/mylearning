import java.util.Scanner;
public class MethodForProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        Product(num1,num2);
        sc.close();
    }
    static void Product(int a,int b){
        System.out.println("The product is "+a*b);
    }
}
