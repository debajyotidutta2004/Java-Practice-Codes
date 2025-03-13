import java.util.*;
public class stringpal {
    public static void main(String[] args) {
        String str = "abccnba";
        int i = 0; //checks from 1st char
        int j = str.length() - 1; //checks from last char
        boolean flag = true; //true -> palindrome
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag == true){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
