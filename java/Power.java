import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        float num=sc.nextFloat();
        System.out.print("Enter the power:");
        int power=sc.nextInt();
        System.out.print("The power of number is:"+Math.pow(num,power));
    }
    
}
