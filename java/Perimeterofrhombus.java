import java.util.Scanner;
public class Perimeterofrhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side length:");
        int side=sc.nextInt();
        System.out.println("The perimeter of Rombus is:"+(side+side+side+side));
    }
}
