import java.util.Scanner;
public class MethodForPlaindome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        Plaindome(num);
        sc.close();
    }
    static void Plaindome(int n){
        int x=0,prev=n;
        while(n>0){
            x+=n%10;
            x*=10;
            n/=10;
        }
        x/=10;
        if(x==prev){
            System.out.println(prev+" is a Plaindome");
        }
        else{
            System.out.println(prev+" is not a Plaindome");
        }
    }
}
