import java.util.Scanner;
public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Height:");
        long height=input.nextLong();
        System.out.print("Enter the Base:");
        long base=input.nextLong();
        long area=(height*base)/2;
        System.out.println("The area is:" +area);
        input.close();
    }
}
