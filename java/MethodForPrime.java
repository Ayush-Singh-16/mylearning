import java.util.Scanner;
public class MethodForPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num==1 || num<1){
            System.out.println("Enter a valid number");
        } 
        else{
            Prime(num);
        }
        sc.close();
    }
    static void Prime(int n){
        int x=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println(n+" is not prime");
                x+=1;
                break;
            }
        }
        if(x==0){
            System.out.println(n+" is prime");
        }
    }
}
