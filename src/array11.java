public class array11  {
    public static void main(String[] args){
        int a = 19;
        String name = "Debajyoti  Dutta";

        int roll1 = 23;
        int roll2 = 55;
        int roll3 = 18;
        //syntax
        // datatype[] variable name = new datatype[size];
        // store 5 roll numbers:
        int[] rnos = new int[5];
        //or
        int[] rnos2 = {23, 12, 45, 32, 15};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; //initialization : here the actual object is being created in the memory(heap)

        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

        String str = null;


    }
}
