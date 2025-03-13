class Algebra{
    //int a=10;//member variables


    int add(){
       int p=100;
       int q=20;
       return p+q;
    }
    int sub(){
       int p=56;
       int q=24;
       return p-q;
    }
    void demo(){
        int a=5;
        System.out.println(a);
       // System.out.println(b);
        for(int i=0;i<5;i++)
        {
            int b=10;
            System.out.println(b);//10
        }
        //System.out.println(b);
        if(true)
        {
            int b=100;
            System.out.println(b);//100
        }
    }

}



public class xcbv {
    public static void main(String[] args) {
      Algebra ob=new Algebra();
      ob.demo();

    }
}
