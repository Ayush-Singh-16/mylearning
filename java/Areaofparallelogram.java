import java.util.Scanner;
public class Areaofparallelogram {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the height:"); 
       int height=sc.nextInt();
       System.out.print("Enter the base:");
       int base=sc.nextInt();
       int area=height*base;
       System.out.println("The area of parallelogram is:"+area);
       sc.close();
    }
}
