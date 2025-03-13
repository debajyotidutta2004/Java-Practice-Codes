import java.util.Scanner;

public class SeriesSum {
    //alternate sums
    static int seriesSum2(int n){
        if(n == 0) return 0;
        if(n % 2 == 0){
            return seriesSum2(n-1) - n;
        }else{ //odd
          return seriesSum2(n-1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seriesSum2(n));
    }
}
