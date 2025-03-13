import java.util.*;
public class operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int op = 0;
        if(n  == 1){
            System.out.println("No of operation is 0");
        }
        else if(n == 2){
            System.out.println("No of operations is 1");
        }
        else if(n % 2 == 0)
            System.out.println("No of operations is 2");
        else{
            System.out.println("No of operations is 3");
        }
    }
}
