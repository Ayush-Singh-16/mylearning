import java.util.Scanner;
public class VoteElligible {
    static void vote(int age){
        if(age>=18){
            System.out.println("Eligible to give vote");
        }
        else{
            System.out.println(" Not Eligible to give vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        vote(age);
        sc.close();
    }
}
