public class Student_ab {
    String name;
    int rno;
    double percent;
    final String schoolName = "BBPS";
    private static int numberofStudents;
    //default constructor
    public Student_ab(){

    }
    public Student_ab(String name, int rno, double percent){
        this.name = name;
        this.rno = rno;
        this.percent = percent;
        numberofStudents++;
    }
    public static int getNumberofStudents(){
        return numberofStudents;
    }
    public int getRno(){ return rno; }
    public void setRno(int rno){ this.rno = rno; }

}
