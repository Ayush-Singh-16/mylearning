import java.util.Scanner;
public class Curvedsurfaceareaofcylinder {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the radius:");
     int radius=sc.nextInt();
     System.out.print("Enter the heigth:");
     int height=sc.nextInt();
     float csa=(float)(2*22*height*radius)/7;
     System.out.print("The Curved surface area is:"+csa);
     sc.close();

    }
    
}
