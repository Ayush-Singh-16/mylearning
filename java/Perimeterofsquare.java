import java.util.Scanner;
public class Perimeterofsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side length:");
        int side=sc.nextInt();
        System.out.println("The perimeter is:"+(side+side+side));
    }
    
}
