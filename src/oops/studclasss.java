package oops;
import java.util.Scanner;
public class studclasss {
    //creating a new data type
    public  static class Student{
        public String name;
        int rno;
        double percent;
    }
    public static class Car{
        public String name;
        String type;
        int price;

    }
    public static void fun(String x){
        System.out.println(x);
        return;
    }
    public static void main(String[] args) {

        String name = "Raghav";
        fun(name);
        Car c1 = new Car();
        c1.name = "Alto";
        c1.price = 4000000;
        c1.type = "hatchback";

        Student x1 = new Student();
        x1.name = "Raghav";
        x1.rno = 21;
        x1.percent = 89.6;

        Student s1 = new Student();
        s1.name = "Debajyoti";
        s1.rno= 32;
        s1.percent = 93.3;

    }
}
