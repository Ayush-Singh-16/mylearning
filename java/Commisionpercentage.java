import java.util.Scanner;
public class Commisionpercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Commission Amount:");
        float amt=sc.nextFloat();
        System.out.print("Enter the Total Sales or Revenue:");
        float rev=sc.nextFloat();
        float comm=(amt/rev)*100;
        System.out.print("The commision is:"+comm);
        sc.close();
    }
    
}
