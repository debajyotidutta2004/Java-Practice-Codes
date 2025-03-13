public class pyramidtri {
    public static void main(String[] args) {
        int n = 5;
        for(int i =1; i<= n; i++){
            int k =1;
            for(int j = 1;j <= 2*n-1; j++){
                if(j >= n+1-i && j <= n-1+i && k == 1){
                    System.out.print("*");
                    k = 0;
                }
                else{
                    System.out.println(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
