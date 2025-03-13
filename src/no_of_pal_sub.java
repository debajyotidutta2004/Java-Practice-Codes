import java.util.*;
public class no_of_pal_sub {
    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abcd";
        int count = 0;
        for(int i = 0;i <= str.length()-1;i++){
            for(int j = i+1; j <= str.length()- 1;j++){
                if(isPalindrome(str.substring(i,j)) == true){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println("The number of palindromic substrings are :"+count);

    }
}
