import java.sql.SQLOutput;
import java.util.Scanner;
public class simpleintrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle ");
        float p=sc.nextFloat();
        System.out.println("Enter rate of intrest");
        float r=sc.nextFloat();
        System.out.println("Enter time");
        float t=sc.nextFloat();
        float si=(p*r*t)/100;
        System.out.println("The simple intrest is"+si);

    }
}
