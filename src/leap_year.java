import java.sql.SQLOutput;
import java.util.*;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int yr = sc.nextInt();
        if(yr % 400 == 0 || yr % 4 == 0){
            System.out.println("Leap year" +yr);
        }else{
            System.out.println("Not a leap year"+yr);
        }
    }
}
