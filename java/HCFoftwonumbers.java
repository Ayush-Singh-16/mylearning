import java.util.Scanner;
public class HCFoftwonumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();
        System.out.print("Enter second number:");
        int num2=sc.nextInt();
        int rem;
        if(num2>num1){
            while(num2%num1!=0){
                rem=num2%num1;
                num2=num1;
                num1=rem;
            }
            System.out.print("The HCF is:"+num1);
        }
        else if(num2<num1){
            while(num1%num2!=0){
                rem=num1%num2;
                num1=num2;
                num2=rem;
            }
            System.out.print("The HCF is:"+num2);
        }
        else{
            System.out.print("Both numbers are equal");
        }
        sc.close();
    }
}
