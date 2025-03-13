import java.util.*;
public class swap_wo_third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two variables to swap");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The swapped numbers are"+a+" "+b);
    }
}
