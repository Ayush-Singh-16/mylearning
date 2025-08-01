import java.util.Scanner;
public class Volumeofprism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length:");
        int length=sc.nextInt();
        System.out.print("Enter the breadth:");
        int breadth=sc.nextInt();
        System.out.print("Enter the height:");
        int height=sc.nextInt();
        int volume=(length*breadth*height)/2;
        System.out.print("The volume of the prism is:"+volume);

    }
    }

    
    

