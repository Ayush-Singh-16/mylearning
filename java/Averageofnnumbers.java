import java.util.Scanner;
public class Averageofnnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter a number:");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            sum+=i;
        }
        System.out.println("The sum is:"+sum);
        sc.close();
    }
    
}
