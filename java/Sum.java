import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter two numbers:");
        long num1=input.nextLong();
        long num2=input.nextLong();
        long sum=num1+num2;
        System.out.println("The sum is: "+ sum);
        input.close();

    }
    
}
