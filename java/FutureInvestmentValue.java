import java.util.Scanner;
public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the present value:");
        Float amm=sc.nextFloat();
        System.out.println("Enter the intrest rate:");
        float intrest=sc.nextFloat();
        System.out.println("The Future Investment Value is:"+amm*(1+intrest));
        sc.close();
    }
}
