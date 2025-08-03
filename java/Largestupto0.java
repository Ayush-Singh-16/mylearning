import java.util.Scanner;
public class Largestupto0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=1,largest=0;
        System.out.println("Enter a number (or 0 to end):");
        while(num!=0){
            num=sc.nextInt();
            if(num>largest){
                largest=num;
            }
        }
        System.out.print("The largest number you entered is:"+largest);
        sc.close();
    }
    
}
