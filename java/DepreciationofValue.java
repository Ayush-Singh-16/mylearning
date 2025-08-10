import java.util.Scanner;
public class DepreciationofValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Asset cost:");
        float asset=sc.nextFloat();
        System.out.print("Enter Salvage value:");
        float salv=sc.nextFloat();
        System.out.print("Enter Useful life:");
        float life=sc.nextFloat();
        System.out.print("Depreciation of Value is:"+(asset-salv)/life);
        sc.close();
}
    
}
