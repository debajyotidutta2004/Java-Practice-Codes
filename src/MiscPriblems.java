import java.util.Scanner;
public class MiscPriblems {

    static void swapWithoutTemp(int a, int b){
        System.out.println("Original values before swap");
        System.out.println("a: "+a);
        System.out.println("b "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("values after swap");
        System.out.println("a: "+a);
        System.out.println("b "+b);
    }

    static void swap(int a , int b){
        System.out.println("Original values before swap");
        System.out.println("a: "+a);
        System.out.println("b "+b);

        int temp =a;
        a=b;
        b=temp;

        System.out.println("values after swap");
        System.out.println("a: "+a);
        System.out.println("b "+b);

        //a=3, b=9
    }
    static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;


        //traverse the original array in reverse direction
        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i]; //post increment

        }
        return ans;
    }

    static void printArray(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    static void swapInArray(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
    static void reverseArray1(int[] arr){
        int i=0,j=arr.length-1;

        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }

    static int[] rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    static void reverse(int[] arr,int i,int j){

        while(i<j){
            swap(i,j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0, n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

    }


    public static void main(String[] args) {
      //  int a=9;
       // int b=3;
       // int[] arr={1,2,3,4,5};
        //int[] ans=reverseArray(arr);
        //for(int i=0;i< ans.length;i++){
          //  System.out.println(ans[i]+ " ");
        //}
       // swap(a,b);
        //swapWithoutTemp(a,b);
        //reverseArray1(arr);
       // printArray(arr);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter"+n+"elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("Enter k:");
        int k=sc.nextInt();

        System.out.println("Original Array");
        printArray(arr);
        rotateInPlace(arr,k);
       // int[] ans=rotate(arr,k);
        System.out.println("Array after rotation");
        printArray(arr);

    }
}
