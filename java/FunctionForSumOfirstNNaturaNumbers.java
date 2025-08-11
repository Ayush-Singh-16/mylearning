import java.util.Scanner;
public class FunctionForSumOfirstNNaturaNumbers {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter N:");
    int n=sc.nextInt();
    UptoN(n);
    sc.close();
 }   
 static void UptoN(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
        sum+=i;
    }
    System.out.print("The sum upto N is="+sum);
 }
}
