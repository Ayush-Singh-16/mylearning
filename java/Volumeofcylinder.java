import java.util.Scanner;
public class Volumeofcylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the radius:");
        int radius=sc.nextInt();
        float volume=(float)3.14*(radius*radius*radius);
        System.out.print("The volume of sphere is:"+volume);
        sc.close();
    }
    
}
