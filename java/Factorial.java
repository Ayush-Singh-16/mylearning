import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,total=1;
        System.out.println("Enter a number:");
        num=sc.nextInt();
        while(num>0){
            total*=num;
            num--;
        }
        System.out.println("The factorial is:"+total);
        sc.close();
    }
}
