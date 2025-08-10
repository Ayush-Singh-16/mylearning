import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int a=num;
        int len=String.valueOf(num).length();
        int x=0;
        while(num>0){
            x+=Math.pow(num%10,len);
            num/=10;
        }
        if(x==a){
            System.out.println("It is an armstrong number");
        }
        else{
            System.out.println("It not an armstrong number");
        }
        sc.close();

    }
    
}
