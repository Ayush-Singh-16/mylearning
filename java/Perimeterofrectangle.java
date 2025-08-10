import java.util.Scanner;
public class Perimeterofrectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length:");
        int length=sc.nextInt();
        System.out.print("Enter the bredth:");
        int bredth=sc.nextInt();
        System.out.print("The perimeter of the recgtangle is:"+2*(length+bredth));
    }
    
}
