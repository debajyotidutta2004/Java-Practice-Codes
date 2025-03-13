public class Bubble {

    static void bubbleSort(int[] a){
        int n = a.length;

        //n-1 iterations/passes
        // i =0 to i = n-2 -> n-1
        for(int i = 0; i < n-1; i++){
            boolean flag= false;  //means no swapping happened
            for(int j = 0; j < n-i-1; j++){   //comparing adjacent elements
                //last i elements are already at correct sorted positions - so no need to check them
                if(a[j] > a[j+1]){
                    //swap = a[j], a[j+1]
                    int temp =a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag =true; //some swap has happened
                }
                if(flag == false){ //no swaps
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2,1,3,4,5};
        bubbleSort(a);
        for(int i : a){
            System.out.print(i+" ");
        }


    }
}
