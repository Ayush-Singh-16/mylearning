import java.util.Scanner;
public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Total number of runs scored:");
        int run=sc.nextInt();
        System.out.println("Number of times the batter has been dismissed:");
        int out=sc.nextInt();
        System.out.println("The batting average is:"+run/out);
        sc.close();
    }
    
}
