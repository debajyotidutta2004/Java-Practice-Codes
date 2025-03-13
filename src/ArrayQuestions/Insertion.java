package ArrayQuestions;

public class Insertion{
    static void insertionSort(int[] a){
        int n = a.length;
        for(int i = 1;i < n; i++) {
            int j = i;

            while (j > 0 && a[j] < a[j - 1]) {
                //swap a[[j], a[j-1]
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {3,4,5,2};
        insertionSort(a);
        for(int i =0;i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
