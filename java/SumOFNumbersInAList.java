import java.util.Scanner;
public class SumOFNumbersInAList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str=new String[100];
        System.out.println("Enter the number (or x/X to end):");
        int sum=0;
        int i=0;
        while(true){
            str[i]=sc.next();
            if(str[i].equals("x")||str[i].equals("X")){
                break;
            }
            else{
               sum+=Integer.parseInt(str[i]);
        }
        }
        System.out.println("The sum is:"+sum);
        sc.close();
     }
     }
    


