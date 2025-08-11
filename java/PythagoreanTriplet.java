import java.util.Scanner;
public class PythagoreanTriplet {
    static void Max(int num1,int num2,int num3){
        if(num1>=num2&&num1>=num3){
            Pytha(num1,num2,num3);
        }
        else if(num2>=num1&&num2>=num3){
            Pytha(num2,num1,num3);
        }
        else{
            Pytha(num3,num2,num1);
        }    
    }
    static void Pytha(int n1,int n2,int n3){
        if((n1*n1)==(n2*n2)+(n3*n3)){
            System.out.println("Given triplet is a Pythagorean triplet");
        }
        else{
            System.out.println("Given triplet is not a Pythagorean triplet");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        Max(num1,num2,num3);
        sc.close();
    }
    
}
