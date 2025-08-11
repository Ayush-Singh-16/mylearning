import java.util.Scanner;
public class PrimeNumbersBetweenTwoGivenNumber {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the starting and ending range respectively:");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    Prime(num1,num2);
    sc.close();
   } 
   static void Prime(int n1,int n2){
    int x=0;
    if(n1==1){
        n1++;
    }
    if(n1==0){
        n1+=2;
    }
    if(n1>0&&n1<n2){
    for(int i=n1;i<=n2;i++){
         for(int j=2;j*j<=i;j++){
            if(i%j==0){
                x+=1;
                break;
            }
        }
        if(x==0){
            System.out.print(i+" ");
        }
        x=0;
    }
   }
   else{
    System.out.print("Enter a valid range");
   }
}
}
