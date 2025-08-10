import java.util.Scanner;
public class Volumeofpyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        int length=sc.nextInt();
        System.out.println("Enter the width:");
        int width=sc.nextInt();
        System.out.println("Enter the heigth:");
        int height=sc.nextInt();
        float volume=(float)(length*width*height)/3;
        System.out.println("The volume is:"+volume);
        sc.close();

    }
    
}
