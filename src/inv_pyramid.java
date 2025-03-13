import java.util.*;
public class inv_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i =1; i <= n;i++){
            int k = 1;
            for(int j = 1;j <= 2*n-1;j++){
                if(j>=i && j<= 2*n-i){
                    System.out.print("*");
                }else{
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
