package oops.skills;

public class outsidepwskills {
    public static void main(String[] args) {
        App obj=new App();
        System.out.println("Outside Package, non-child class"+obj.str_1);

    }
}
//child class    //parent class
class App3 extends App{
    void printfromchildclass(){
        App3 obj3=new App3();
        System.out.println("Child CLass"+obj3.str_1);}
}
