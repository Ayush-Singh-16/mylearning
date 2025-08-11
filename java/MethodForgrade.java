import java.util.Scanner;
public class MethodForgrade {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks:");
    int marks=sc.nextInt();
    Grade(marks);
   } 
   static void Grade(int m){
    if(m<=100&&m>=91){
        System.out.println("AA");
    }
    if(m<=90&&m>=81){
        System.out.println("AB");
    }
    if(m<=80&&m>71){
        System.out.println("BB");
    }
    if(m<=70&&m>=61){
        System.out.println("BC");
    }
    if(m<=60&&m>=51){
        System.out.println("CC");
    }
    if(m<=50&&m>=41){
        System.out.println("CD");
    }
    if(m<=40){
        System.out.println("Fail");
    }
   }
}
