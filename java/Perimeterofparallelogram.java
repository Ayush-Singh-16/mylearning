import java.util.Scanner;
public class Perimeterofparallelogram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of base:");
        int base=sc.nextInt();
        System.out.print("Enter the length of side:");
        int side=sc.nextInt();
        System.out.println("The perimeter of thr parallelogram is:"+(2*(base + side)));
        sc.close();
    }
    
}
