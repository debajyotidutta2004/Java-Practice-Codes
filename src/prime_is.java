import java.util.Scanner;
public class prime_is {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(is_prime(n)){
            System.out.println(n + "is a prime number");
        }
        else{
            System.out.println(n + "is not a prime number");
        }
    }
    public static boolean is_prime(int n){
        if( n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
