import java.util.Scanner;
public class LCMoftwonumbers {
    static int HCF(int num1,int num2){
        int rem;
        if(num1>num2){
            while(num1%num2!=0){
                rem=num1%num2;
                num1=num2;
                num2=rem;
            }
            return num2;
        }
        else if(num2>num1){
            while(num2%num1!=0){
                rem=num2%num1;
                num2=num1;
                num1=rem;
            }
            return num1;
        }
        else{
            return num1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1=sc.nextInt();
        System.out.print("Enter the second number:");
        int num2=sc.nextInt();
        int lcm=(num1*num2)/HCF(num1,num2);
        System.out.print("The LCM is:"+lcm);
        sc.close();
    }
    
}
