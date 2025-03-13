import java.util.*;
public class uppertolower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        //toggle
        //PHysiCs -> phYSIcS
        for(int i = 0;i <= str.length() - 1; i++){
            //P -> p
            // check -> alphabet - small, capital
            boolean flag = true; //true -> capital
            char ch = str.charAt(i); //A
            if(ch == ' ') continue;
            int asci = (int)ch;
            if(asci >= 97) flag = false; //small letter
            if(flag == true) {
                asci += 32;
                char dh = (char) asci; //a
                str.setCharAt(i, dh);
            }
            else{ //small
                asci -= 32;
                char dh = (char)asci;
                str.setCharAt(i,dh);

            }
        }
        System.out.println(str);
    }
}
