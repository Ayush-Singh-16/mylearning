import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        float p=sc.nextFloat();
        System.out.println("Enter the annual intrest rate:");
        float i=sc.nextFloat();
        System.out.println("Enter the period of time(in years):");
        int n=sc.nextInt();
        System.out.println("The compound intrest is:"+(p+Math.pow(1+i,n)-p));
        sc.close();
    }
    
}
