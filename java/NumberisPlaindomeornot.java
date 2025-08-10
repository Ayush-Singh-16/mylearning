import java.util.Scanner;
public class NumberisPlaindomeornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int num1=num;
        int rev=0;
        while(num>0){
            rev+=num%10;
            rev*=10;
            num/=10;
        }
        rev/=10;
        if(num1==rev){
            System.out.println("The number is a Plaindome");
        }
        else{
            System.out.println("The number is not a Plaindome");
        }
        sc.close();
    }
}
