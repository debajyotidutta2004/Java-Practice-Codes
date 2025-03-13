import java.util.*;
public class Main1234 {


    public static void main(String[] args) {
        //wrapper class
       // Integer i = Integer.valueOf(4);
      //  System.out.println(i);

        Float f = Float.valueOf(4.5f);
        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<Integer>();
        //ArrayList<Boolean> l2 = new ArrayList<>();
        //ArrayList<Float> l3 = new ArrayList<>();

        // add a new element
        l1.add(5);   //5
        l1.add(6);   //6
        l1.add(7);   //7
        l1.add(8);   //8

        // get an element at index i
        System.out.println(l1.get(0)); //6

        //print with for loop
//        for(int i = 0; i< l1.size();i++){
//            System.out.println(l1.get(i)); //5,6,7,8
//        }
        //printing the array list directly
        System.out.println(l1); //[5,6,7,8]

        //adding element at some index i //5 100 6 7 8
        l1.add(1,100);
        System.out.println(l1);

        //modifying element at index i
        l1.set(1, 10);
        System.out.println(l1);  //[5,10,6,7,8]

        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        //removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1); //5,6,8

        //check if an element exists
        boolean ans = l1.contains(Integer.valueOf(60));
        System.out.println(ans);

        //if you don't specify class, you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("pwskills");
        l.add(1);
        l.add(true);
        System.out.println(l);
    }
}
