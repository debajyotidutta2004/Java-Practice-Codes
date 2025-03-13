import java.util.*;
public class internin {
    public static void main(String[] args){
        String s = "Hello"; // -> 'Heylo'
        // String x = "Hello";
        // x = "Mello";
        //System.out.println(x);
         //s.charAt(0) = 'D'; we cannot change
        //s = "Dello";
        //2 -> y
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
    }
}
