import java.util.Scanner;
public class MethodForAreaOfACircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        float radius=sc.nextFloat();
        System.out.println("The circumferance is "+Area(radius));
    }
    static float Area(float r){
        return (2*22*r)/7;
    }
}
