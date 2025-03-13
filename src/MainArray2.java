import java.util.Arrays;
import java.util.Scanner;


public class MainArray2 {

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.print("Enter  "+n+"elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt(); //taking array input
        }

        System.out.println("Original Array");
        printArray(arr);

        int[] arr_2=Arrays.copyOfRange(arr, 0, arr.length);

        //trying to copy arr to arr_2
        int[] arr_1=arr;
        System.out.println("Copied array");
        printArray(arr_2);
        //changing some values of arr_2


    }
}
