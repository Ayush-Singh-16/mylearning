import java.util.Scanner;
public class Totalsurfaceareaofcube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of side:");
        int side=sc.nextInt();
        System.out.print("The total surface area of cube is:"+6*(side*side));
        sc.close();
    }
}
