import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int num=1;

        while (num <= n){
            System.out.println(sum);
            sum= sum +num;
            num++ ;
        }
    }
}
