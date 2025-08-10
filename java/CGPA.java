import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of semesters:");
        int sem=sc.nextInt();
        float sum=0;
        for(int i=1;i<=sem;i++){
            System.out.println("Enter the result of semester" +i+":");
            sum+=sc.nextFloat();
        }
        System.out.println("The CGPA is:"+(sum/sem));
        sc.close();
    }
    
}
