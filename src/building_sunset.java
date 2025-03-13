import java.util.*;
public class building_sunset {
    public static int countmaxheight(int n, int[] height){
        if(n == 0 || height == null){
            return 0;
        }
        int count  = 0;
        int maxheight = 0;
        for(int i = 0;i < height.length;i++){
            if(height[i] > maxheight){
                maxheight = height[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of buildings");
        int n = sc.nextInt();
        System.out.println("Enter the heights of the number of buildings");
        int[] height = new int[n];
        for(int i = 0;i < n; i++){
            height[i] = sc.nextInt();
        }
        int result = countmaxheight(n, height);
        System.out.println("Number of buildings can watch sunset"+result);
    }
}
