import java.util.Arrays;
import java.util.Scanner;
public class Question {

    static int[] smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans={arr[0],arr[arr.length-1]};
        return ans;
    }

    static  boolean isSorted(int[] arr){
        boolean check = true;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]) {
                check = false;
                break;
            }
        }
        return check;
    }
    static int lastOccurence(int[] arr,int x){
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;
    }

    static int countOfOccurences(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter "+n+"elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
      //  System.out.println("Enter x");
        //int x=sc.nextInt();

        //System.out.println("COUNT OF X:"+countOfOccurences(arr,x));
        //System.out.println("Last occurence OF X:"+lastOccurence(arr,x));
        //System.out.println("IS sorted"+isSorted(arr));
        //smallestAndLargestElement(arr);
        int[] ans=smallestAndLargestElement(arr);
        System.out.println("Smallest "+ans[0]);
        System.out.println("Largest"+ans[1]);
    }
}


