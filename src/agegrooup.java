import java.util.Scanner;
public class agegrooup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<=12) {
            System.out.println("Child");
        }else if((age>13) && age<18) {
            System.out.println("teenager");
        }else{
            System.out.println("adult");
        }

    }
}
