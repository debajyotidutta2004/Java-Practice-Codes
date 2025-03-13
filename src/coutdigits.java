import java.util.Scanner;
public class coutdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumofdigits=0;
        int original_n=0;
        while(n>0){
            sumofdigits+=n%10;
            n=n/10;
        }
        System.out.println("Number of digits"+original_n+" = "+sumofdigits);

    }
}
