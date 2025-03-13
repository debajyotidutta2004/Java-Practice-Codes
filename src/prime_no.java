import java.util.*;
public class prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int flag = 1; //prime no
        for(int i = 2;i*i <= n; i++){ //condition
            if(n% i == 0){
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Prime no: "+n);
        }else{
            System.out.println("Not prime no: "+n);
        }
    }
}
