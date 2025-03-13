import java.util.Scanner;
public class Sum {

    static int seriesSUm(int n){
        if(n == 0){
            return 0;
        }
        return seriesSUm(n-1) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seriesSUm(n));
    }
}
