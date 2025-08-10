import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int sum=1;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                sum+=i;
                if(i!=num/i){
                    sum+=num/i;
                }
            }
        }
        if(num==sum){
            System.out.println("The number is a perfect number:"+num);
        }
        else{
            System.out.println("The number is not a perfect number:"+num);
        }
        
       sc.close();
    }
}
