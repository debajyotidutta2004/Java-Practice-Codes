public class Main123 {

    static void changeValue(int a){
        a *=100;
        System.out.println("Inside changed value"+a);
    }


    public static void main(String[] args) {

        int a=10;
        System.out.println("Before changing"+a);
        changeValue(a);
        System.out.println("After changing"+a);

    }
}
