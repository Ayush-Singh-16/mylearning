import java.util.Scanner;
public class FunctionForEvenorOdd {
    static void fun(int num){
        if(num%2==0){
            System.out.println(+num+" is a even number");
        }
        else{
            System.out.println(num+" is a odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        fun(num);
        sc.close();
    }
}
