package oops;

class Student {
    int rollno;
    String studentname;
}
public class Main {
    public static void main(String[] args) {

        Student obj1 = new Student();
        obj1.rollno=1;
        obj1.studentname="Rohan";
        System.out.println(obj1.rollno);
        System.out.println(obj1.studentname);

        Student obj2=new Student();
        obj2.rollno=2;
        obj2.studentname="Ayush";
        System.out.println(obj2.rollno);
        System.out.println(obj2.studentname);


    }
}