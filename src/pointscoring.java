import java.util.*;
public class pointscoring {
    static int[] calculateScores(int l, int r, int[] points){
        int n = points.length;
        int[] scores = new int[n];
        for(int i = 0; i < n; i++){
            int score = 0;
            if(points[i] >= l && points[i] <= r){
                score = 1;
            }
            scores[i] = score;
        }
        return scores;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start range integer");
        int l = sc.nextInt();
        System.out.println("Enter the end range integer");
        int r = sc.nextInt();
        System.out.println("Enter the list of integers representing points");
        int n = sc.nextInt();
        int[] points = new int[n];
        for(int i = 0; i < n; i++){
            points[i] = sc.nextInt();
        }
        int[] scores = calculateScores(l, r, points);
        System.out.println("Scores of each point: "+ Arrays.toString(scores));
    }
}
