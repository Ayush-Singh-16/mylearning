import java.util.Scanner;
public class Curvedsurfaceareaofcylinder {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the radius:");
     int radius=sc.nextInt();
     System.out.println("Enter the heigth:");
     int height=sc.nextInt();
     float csa=(float)(2*22*height*radius)/7;
     System.out.println("The Curved surface area is:"+csa);
     sc.close();

    }
    
}
