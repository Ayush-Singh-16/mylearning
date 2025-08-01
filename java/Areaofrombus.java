import java.util.Scanner;
public class Areaofrombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first diagonal:");
        int d1=sc.nextInt();
        System.out.print("Enter the second diagonal:");
        int d2=sc.nextInt();
        int area=(d1*d2)/2;
        System.out.println("The area of the rombus is:"+area);
        sc.close();
    }
}
