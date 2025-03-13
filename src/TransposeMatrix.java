import java.util.Scanner;
public class TransposeMatrix {
    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            //    System.out.println(arr[i]);
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] findTranspose(int[][] matrix,int r,int c){
        int[][] ans = new int[c][r];

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]= matrix[j][i];
            }
        }
        return ans;
    }
    static void transposeInPlace(int[][] matrix,int r,int c){
        for(int i= 0;i<c;i++){
            for(int j =i;j<r;j++){
                //swap matrix[i][j],marix[j][i]
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void reverseArray(int[] arr){
        int i = 0,j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            i++;
            j--;
        }

    }
    static void rotate(int[][] matrix,int n){
        //transpose
        //reverse each row of transposed matrix
        transposeInPlace(matrix,n,n); // as r and c are equal to n

        //reverse each row of transposed matrix
        for(int i=0;i<n;i++){
            /*
            1,2,3
            4,5,6
            7,8,9
            i=0
            reverseArray({1,2,3})
             */
            reverseArray(matrix[i]);
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows and columns");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];//total =r*c
        int totalElements = r * c;
        System.out.println("Enter" + totalElements + "elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);

        rotate(matrix,r);
        System.out.println("Rotation of matrix");
        printMatrix(matrix);

      //  System.out.println("Transpose of matrix");
       // int[][] ans = findTranspose(matrix,r,c);
       // printMatrix(ans);
        //transposeInPlace(matrix,r,c);
       // printMatrix(matrix);
    }
}
