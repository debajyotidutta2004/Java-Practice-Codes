public class Student_abc {
    public static void change(Student_ab s){
        s.name = "Rohan";

    }

    public static void main(String[] args) {
        System.out.println(Student_ab.getNumberofStudents() );
        Student_ab s1 = new Student_ab("raghav", 76,88);
        System.out.println(s1.getNumberofStudents());
        Student_ab s2 = new Student_ab("rahul", 67, 98);
        System.out.println(s2.getNumberofStudents());
        Student_ab s3 = new Student_ab("rohan", 90, 93);
        System.out.println(s3.getNumberofStudents());
    }

}
