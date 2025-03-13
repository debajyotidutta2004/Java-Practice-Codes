import java.util.*;
public class reversewordinSentence {
    public static void main(String[] args) {
        String str = "I am an student of Btech";
        str = str + " ";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int  i = 0; i <= str.length()-1; i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }
        System.out.println(ans);
    }
}
