import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int num=n;num>=1;num=num-2){ //num-=2, num=num-2

            System.out.println(num);
        }
    }
}
