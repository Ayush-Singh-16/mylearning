import java.util.Scanner;
public class NcrNpr {
    public static int Factorial(int x){
        if(x==0||x==1){
            return 1;
        }
        else{
            return x*Factorial(x-1);
        }
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter total number of objects(n):");
        int n=sc.nextInt();
        System.out.println("Enter number of objects being selected or arranged(r):");
        int r=sc.nextInt();
        if(r>n){
            System.out.println("r can not be greater than n");
        }
        else{
        Float p=(float)Factorial(n)/Factorial(n-r);
        Float c=(float)Factorial(n)/(Factorial(r)*Factorial(n-r));
        System.out.println("The permutation(nPr) is:"+p);
        System.out.println("The Combination(nCr) is:"+c);
        }
        sc.close();
    }
}
