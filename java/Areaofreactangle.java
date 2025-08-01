import java.util.Scanner;
public class Areaofreactangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length:");
        int length=sc.nextInt();
        System.out.print("Enter the breadth:");
        int breadth=sc.nextInt();
        int area=length*breadth;
        System.out.print("Tghe area of the reactangle is:"+area);
        sc.close();
    }
    
}
