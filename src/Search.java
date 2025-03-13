public class Search {
    static void findAllIndices(int[] arr,int n, int target, int idx){ //1,2,3,2,2,5
        //base case
        if(idx >= n){
            return;
        }
        //self work
        if(arr[idx] == target){
            System.out.println(idx);
        }
        //recursive work
        findAllIndices(arr, n,target, idx+1); //1,3,4
    }










    //return index of element if element is present in array otherwise return -1
    static int findIndex(int[] arr, int n, int target, int idx){
        if(idx >= n) return -1;

        if(arr[idx] == target) return idx;

        return findIndex(arr,n,target, idx+1);
    }

    //true , false -> based on existence
    static boolean search(int[] arr,int n,int target, int idx){
        //base case
        if(idx >= n){
            return false;
        }

        //self work
        if(arr[idx] == target) return true;

        //recursive work
        return search(arr,n,target,idx+1);

//        if(search(arr,n,target,idx+1)){
//            return true;
//        }else{
//            return false;
//        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,5,6,7};
        int target = 4;
        int n = arr.length;

        findAllIndices(arr,n,target,0 );

       // System.out.println(findIndex(arr,n,target ,0));
//        if(search(arr,n,target,0)){
//            System.out.println("Element found");
//        }
//        else{
//            System.out.println("Not found");
//        }
    }
}
