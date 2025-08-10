import java.util.Scanner;
public class Sumupto0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=1, sum=0;
        System.out.print("Enter a number (or 0 to end):");
        while(num!=0){
             num=sc.nextInt();
             sum+=num;
        
    }
    System.out.println("The sum of digits are="+sum);
    sc.close();
}
    
}
