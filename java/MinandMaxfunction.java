import java.util.Scanner;
public class MinandMaxfunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three numbers respectively:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println(Min(num1,num2,num3)+" is The Minimum");
        System.out.println(Max(num1,num2,num3)+" is the Maximum");
        sc.close();
    }
    static int Max(int num1,int num2,int num3){
        if(num1>=num2&&num1>=num3){
            return num1;
        }
        else if(num2>=num1&&num2>=num3){
            return num2;
        }
        else{
            return num3;
        }    
    }
    static int Min(int num1,int num2,int num3){
        if(num1<=num2&&num1<=num3){
            return num1;
        }
        else if(num2<=num1&&num2<=num3){
            return num2;
        }
        else{
            return num3;
        }    
    }
    
}
