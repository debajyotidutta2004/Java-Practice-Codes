public class Factorial {

    static int factorial(int n){ //n = 5
        //base case
        if(n ==0){
            return 1;
        }
        //recursive work
        int smallAns = factorial(n-1);   //factorial(4) = 24

        //self work
        int ans = n*smallAns; //n* factorial(n-1)
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
