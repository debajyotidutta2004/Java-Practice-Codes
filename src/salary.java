import java.util.*;
public class salary {
    public static void main(String[] args) {
        Float hra = 0f, da= 0f, total = 0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        Float salary = sc.nextFloat();
        if(salary <= 10000){
            hra = salary * 0.2f;
            da = salary * 0.8f;
        }
        else if(salary >= 10000 && salary <= 20000){
            hra = salary * 0.25f;
            da = salary *  0.90f;

        }
        else if(salary >= 20001){
            hra = salary * 0.30f;
            da = salary * 0.95f;
        }
        total = salary + hra + da;
        System.out.println("The total salary is "+ total);

    }
}
