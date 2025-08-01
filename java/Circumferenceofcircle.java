import java.util.Scanner;
public class Circumferenceofcircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle");
        int radius=sc.nextInt();
        float circumference=(22*2*radius)/7;
        System.out.println();
        System.out.print("The circumference of the circle is:"+circumference);
        sc.close();
    }
    
}
