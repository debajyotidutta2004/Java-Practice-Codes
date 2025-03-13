import java.util.*;
public class stringCompression {
    public static void main(String[] args) {
        String str = "aaabbccccdde";
        String ans = "" + str.charAt(0); // a -> a3
        int count = 1;
        for(int i = 1;i <= str.length() -1 ;i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev){
                count++;
            }
            else{
                if(count > 1) ans += count; //a3 it becomes
                count = 1; //count gets refreshed
                ans += curr; //b gets added
            }
        }
        if(count > 1) ans += count;
        System.out.println(ans);
    }
}
