import java.util.Scanner;
public class Discountofprodut {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the MRP of product:");
        float mrp=sc.nextFloat();
        System.out.println("Enter the discount:");
        float dis=sc.nextFloat();
        float total=mrp-((mrp*dis)/100);
        System.out.println("The total price after discount is:"+total);
        sc.close();
    }
    
}
