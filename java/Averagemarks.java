import java.util.Scanner;
public class Averagemarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int  sub=sc.nextInt();
        System.out.println("Enter the marks of each sujects:");
        float sum=0;
        for(int i=1;i<=sub;i++){
            sum+=sc.nextFloat();
        }
        System.out.println("The average is:"+(sum/sub));
        sc.close();
    }
    
}
