import java.util.Scanner;
public class Electricitybill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the previous meter reading(in units):");
        float prev=sc.nextFloat();
        System.out.print("Enter the current meter reading(in units):");
        float curr=sc.nextFloat();
        System.out.print("Enter the per units price:");
        float price=sc.nextFloat();
        float total=(curr-prev)*price;
        System.out.println("The total bill is:"+total);
        sc.close();
    }
}
