import java.util.*;
public class palindromestr {
    public static void main(String[] args) {
        String str = "abccba";
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        String s = gtr+"";
        if(str.equals(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }

    }
}
