import java.util.Scanner;
public class swapping {
    static void sortZerosAndOnes(int[] arr){
        int n= arr.length;
        int zeroes=0;
        //count number of zeros
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes++;

            }
        }


        //0 to zeroes -1 :0 ,zeroes to n-1 :1
        for(int i =0;i<n;i++){
            if(i<zeroes){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
    }
    static void sortZeroesAndOnes(int[] arr){
        int n=arr.length;
        int zeroes=0;
        //count number of zeroes
        for(int i = 0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }

        //0 to zeroes-1: 0 , zeroes to n-1:1
        for(int i=0;i<n;i++){
            if(i<zeroes){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
    }
    static void swap(int arr[],int a , int b){
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
    static void sortZeroesAndOnesA(int[] arr){
        int n= arr.length;
        int left = 0, right = n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;

            }
            if(arr[left]==0){
                left ++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }

    static void printArray(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    static void sortArrayByParity(int[] arr){
        int n = arr.length;

        int left = 0,right = n-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;

            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
    static int[] sortSquares(int[] arr){
        int n= arr.length;
        int left = 0,right = n-1;
        int[] ans = new int[n];
        int k = n-1;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k--] = arr[left]* arr[left];
                k++;
                left++;
            }
            else{
                ans[k--] = ans[right] * arr[right];
                right--;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size");
         int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter "+n+"elements");
        for(int i = 0;i < n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("Original array");
        printArray(arr);
        int[] ans = sortSquares(arr);
        //sortZerosAndOnes(arr);
        //sortZeroesAndOnesA(arr);
        //sortArrayByParity(arr);

        System.out.print("Sorted array");

        printArray(ans);
    }

}
