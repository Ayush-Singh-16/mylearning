import java.util.Scanner;
public class Areaofcircle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the radius:");
        long area=input.nextLong();
        area=((area*area)*22)/7;
        System.out.println("The area of the circle is: "+area);
        input.close();
    }

    
}
