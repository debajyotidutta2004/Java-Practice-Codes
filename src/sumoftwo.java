import java.util.Scanner;
public class sumoftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st no.");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd no.");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("addition is"+sum);
    }
}
