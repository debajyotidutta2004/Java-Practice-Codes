import java.util.Scanner;
public class readcharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(4);
        System.out.println("The character is"+ch);
    }
}
