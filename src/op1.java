public class op1 {
    public static class Student {
        String name;
        private int rno;
        double percent;
    }


    public static void fun(Student x){
        System.out.println(x.name);
    }
    public static void change(Student s){
            s.name = "Rohan";

    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Deb";
        s1.percent = 90;
        // s1.rno = 24;
        // System.out.println(s1.rno());
        //s1.setRno(76);
            
    }
}
