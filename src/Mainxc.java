import java.util.Scanner;
public class Mainxc {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);//college
        // arr = {1,2,3} , arr[0]
        char ch = s.charAt(0);
        System.out.println(ch); //c
        for(int i =0 ;i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
}
