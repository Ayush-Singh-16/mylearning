import java.util.Scanner;
public class EvenDaysInAMonth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days in the month:");
        int day=sc.nextInt();
        int sum=0;
        for(int i=1;i<=day;i++){
            if(i%2==0){
                sum+=1;
            }
        }
        System.out.println("The total number of even days are:"+sum);
        sc.close();
    }
}
