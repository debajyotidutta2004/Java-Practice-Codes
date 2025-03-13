public class Selection {

    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i< n-1; i++){ //i represent the current index
             // Find min element in unsorted part of array
                int min_index = i;
                for(int j = i+1; j < n; j++){
                    if(arr[j] < arr[min_index]){
                        min_index = j;
                    }
                }
                //swap current element and minimum element
                //arr[min_index],arr[i]
            //arr[i]= current element
            //arr[min_index] = minimum element
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
        }
    }


    public static void main(String[] args) {
        int[] arr= {7,4,5,1,200,90};
        selectionSort(arr);
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
