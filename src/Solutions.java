import java.util.*;

public class Solutions {

    public static void main(String args[]) {

        int n = 5;

        for (int i = 1; i<=n; i++) {

//spaces
            for (int j = 1;j <= n - i;j++) {
                System.out.print(" ");

//first part

                for (int k = 1; k>=1; k--) {
                    System.out.print(k);
                }

                }

//second part

                for (int j = 2 ; j<=1; j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
