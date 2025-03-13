import java.util.*;
public class Ball_dist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of balls: ");
        int N = sc.nextInt();
        int person = 0; //Initial no. of person is zero
        int currentballneed = 0; //required no. of balls be 1
        while(N > currentballneed){
            N -= currentballneed;
            person ++;
            currentballneed ++;
        }
        System.out.println("Maximum number of persons receive the balls: "+person);
    }
}
