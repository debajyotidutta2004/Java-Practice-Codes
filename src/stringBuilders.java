import java.util.*;
public class stringBuilders {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.setCharAt(0,'m');
        System.out.println(str);
        str.append(10);
        System.out.println(str);
        str.insert(2,'y'); //insert
        System.out.println(str); //meyllo10
        str.deleteCharAt(0);
        System.out.println(str);
    }
}
