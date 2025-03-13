class ArrayExample{

    void searchInArray(){
        int[] arr={10,5,3,6,2,8,3,4};
        int x=3;

        int ans=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]== x){
                ans=i;
                break;
            }
        }
        if(ans==-1){
            System.out.println("not found");
        }else {
            System.out.println("Found" + x + "at index" + ans);
        }
    }

    void maxofarray(){
        int [] arr={5,3,6,2,8,4};

        int ans = 0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]>ans)
                ans =arr[i];
        }
        System.out.println("Max" +ans);

    }

    void sumofArray(){
        int[] arr={1,4,5,6,1};
        int sum=0;

        for(int i = 0; i<arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.println(sum);
    }

    void multiArray(){
       // int[][] arr_1=new int[5][3];
        int[][] arr={{56,43,6},{35,4,89},{12,56,50}};

        for(int i=0;i<arr.length;i++){
            //arr[0] and arr[1]
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]);
            }
        }

        int[][][] arr_3=new int[5][3][2];
        arr_3[0][0][0]=1;

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
    }

    void demoArrays(){
        int[] ages=new int[3];
        float[] weights=new float[3];
        String[] names={"Rahul","raj","aradhya","Vaishali"};
        System.out.println(ages.length);
        System.out.println(weights.length);
        System.out.println(names.length);

        ages[0]=34;
        ages[1]=12;
        ages[2]=45;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        for(int i=0;i<3;i++){
            System.out.println(ages[i]);

        }

        for(int age : ages){
            System.out.println(age);
        }

        int i=0;
        while(i<3){
            System.out.println(ages[i]);
            i++;
        }

    }
}

public class Main124 {
    public static void main(String[] args) {
        ArrayExample obj=new ArrayExample();
       //obj.demoArrays();
       //obj.multiArray();
        //obj.sumofArray();
        // obj.maxofarray();
        obj.searchInArray();
    }

}
