import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 nos");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = a > b ? a : b;
        for(int i  =  a; i< a*b; i++){
            if(i % a == 0 && i % b == 0){
                lcm = i;
                break;
            }
        }
        System.out.println("LCM is"+lcm);
    }
}
