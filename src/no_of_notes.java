import java.util.*;
public class no_of_notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int note500 =0, note100 =0, note50 = 0, note20 = 0, note10 = 0, note5 = 0, note2 = 0, note1 =0;
        System.out.println("Enter the amount to be calculated in notes");
        int amt = sc.nextInt();
        if(amt >= 500) {
            note500 = amt / 500;
            amt -= note500 * 500;

        }
        if(amt >= 100){
            note100 = amt/100;
            amt -= note100 * 100;

        }
        if(amt >= 50){
            note50 = amt/50;
            amt -= note50*50;
        }
        if(amt >= 20){
            note20 = amt/20;
            amt -= note20*20;
        }
        if(amt >= 10){
            note10 = amt/10;
            amt -= note10*10;
        }
        if(amt >= 5){
            note5 = amt/5;
            amt -= note5*5;

        }
        if(amt >= 2){
            note2 = amt/2;
            amt -= note2*2;
        }
        if(amt >= 1) {
            note1 = amt;
            amt -= note1;
        }
        System.out.print("No. of 500 rs notes" +note500);
        System.out.println("No. of 100 rs notes" +note100);
        System.out.println("No. of 50 rs notes" +note50);
        System.out.println("No. of 20 rs notes" +note20);
        System.out.println("No. of 10 rs notes" +note10);
        System.out.println("No. of 5 rs notes" +note5);
        System.out.println("No. of 2 rs notes" +note2);
        System.out.println("No. of 1 rs notes" +note1);

    }
}
