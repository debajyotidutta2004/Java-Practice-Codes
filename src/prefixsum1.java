import java.util.Scanner;
public class prefixsum1 {
    static int[] makePrefixSumArray1(int[] arr){
        for(int i =1;i<arr.length;i++){
            arr[i] +=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter"+n+"elements");
        for(int i =0;i< n;i++){
            arr[i]= sc.nextInt();

        }
        int[] prefSum = makePrefixSumArray1(arr);
        System.out.print("Enter no. of queries");
        int q = sc.nextInt();

        while(q-- >0){
            System.out.println("Enter range");
            int l =sc.nextInt();
            int r = sc.nextInt();
            int ans = prefSum[r] - prefSum[l-1];
            System.out.println("Sum"+ans);

        }

    }
}
