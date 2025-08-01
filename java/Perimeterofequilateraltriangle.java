import java.util.Scanner;
public class Perimeterofequilateraltriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side lrngth of the  equilateral triangle:");
        float side=sc.nextFloat();
        System.out.print("The perimeter is:"+(side+side+side));
        sc.close();
    }
    
}
