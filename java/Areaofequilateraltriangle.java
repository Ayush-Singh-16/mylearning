import java.util.Scanner;
public class Areaofequilateraltriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of side of the equilateral triangle:");
        float side=sc.nextFloat();
        float area=(float) ((Math.cbrt(3)*side*side)/4);
        System.out.print("The area is:"+area);
        sc.close();
    }
    
}
