import java.util.*;
public class triangle_valid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 sides of a triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((b + c) >= a && (a + c) >= b && (a + b) >= c){
            System.out.println("Triangle is valid");
        }else{
            System.out.println("Triangle is not valid");
        }
    }
}
