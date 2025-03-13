
public class continuekeyword {
    public static void main(String[] args) {
        int num=1;
        myloop:for(num=1;num<=50;num++){
            if(num%3==0){
                continue myloop;
            }
            System.out.println(num);
        }

    }
}
