package ArrayQuestions;
import java.util.*;
public class twfwvehicles {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the total number no of vehicles");
        int v = sc.nextInt();
        System.out.println("Enter total number of vehicles");
        int w = sc.nextInt();
        if(w % 2 == 1 || w < 2 ||w <= v){
            System.out.println("Invalid condition");
        }
        int tw = (4*v - w)/2;
        int fw = v - tw;

        System.out.println("No. of  two wheelers: " +tw+ "No of four wheelers :"+fw);
    }
}
