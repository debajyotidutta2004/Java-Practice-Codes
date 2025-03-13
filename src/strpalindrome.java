public class strpalindrome  {
    static boolean isPalindrome(String str){
        int length = str.length();
        for(int i = 0; i < length/2; i++){
            if(str.charAt(i) != str.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        if(isPalindrome(str)) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
