import java.util.*;
public class nearestfibosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int lower_digit = N-1;
        int upper_digit = N+1;
        int product = lower_digit * upper_digit;
        int[] fibonacci = new int[product];
        if(product > 0) fibonacci[0] = 0;
        if(product > 1) fibonacci[1] = 1;
        for(int i = 2; i < product; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        //sum of fibonacci series
        int sum = 0;
        for(int i = 0; i < product; i++){
            sum += fibonacci[i];
        }
        System.out.println("Sum of fibonacci sequences" +sum);
    }
}
