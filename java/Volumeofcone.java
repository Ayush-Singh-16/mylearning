import java.util.Scanner;
public class Volumeofcone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius:");
        float radius=sc.nextFloat();
        System.out.print("Entee the hright:");
        float height=sc.nextFloat();
        System.out.println("The volume is:"+((22*radius*radius*height)/7)/3);
    }
}
