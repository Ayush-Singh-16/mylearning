import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a charatcter:");
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
        ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("The character is Vovel:"+ch);

        }
        else if(Character.isDigit(ch)){
            System.out.println("The character is Digit:"+ch);
        }
        else {
            System.out.println("The character is consonant:"+ch);
        }
        sc.close();
    }
}
