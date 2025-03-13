import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("physics");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.reverse();
        System.out.println(str);
      //  str.delete(2,4); //2 to 3 gets deleted
      //  System.out.println(str);
        System.out.print(str.substring(3));

    }
}
