import java.util.Scanner;
public class Distancebwtwopoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter point 1:");
        float p1=sc.nextFloat();
        System.out.println("Enter point 2:");
        float p2=sc.nextFloat();
        float distance=p2-p1;
        System.out.println("The diatace between the points are:"+distance);
        sc.close();
    }
}
