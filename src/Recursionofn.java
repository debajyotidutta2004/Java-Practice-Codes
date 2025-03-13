
import java.util.*;
public class Recursionofn {
    static void printIncreasing(int n){ //1,2,3,4,. . . . n-1
        //base case
        if(n == 1){
            System.out.println(n);
            return;
        }
        //recursive work
        printIncreasing(n-1); //1,2,....n-1
        //self work
        System.out.println(n);

    }
    static void printDecreasing(int n){  // 5 4 3 2 1
        //base case
        if(n == 1){
            System.out.println(1);
            return;
        }
        //self work,
        System.out.println(n);

        // recursive work
        printDecreasing(n-1);  //n-1,n-2 ,,.....1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      //  printIncreasing(n);
        printDecreasing(n);
    }
}
