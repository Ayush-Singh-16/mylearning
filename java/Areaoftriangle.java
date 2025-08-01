import java.util.Scanner;
public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Height:");
        float height;
        try {
            height = input.nextFloat();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.print("Enter the Base:");
        float base=input.nextFloat();
        float area=(height*base)/2;
        System.out.println("The area is:" +area);
        input.close();
    }
}
