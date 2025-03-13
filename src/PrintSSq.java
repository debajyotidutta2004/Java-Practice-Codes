public class PrintSSq {

    static void PrintSSq(String s,String currAns){//s = "abc", currAns = ""

        //base case
        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }

        char curr = s.charAt(0);  //a
        String remString = s.substring(1);  //bc

        //Curr char -> chooses to be a part of currAns
        PrintSSq(remString, currAns + curr); //bc,a

        //Curr char -> does not chooses to be a part of currAns
        PrintSSq(remString,currAns);
    }
    public static void main(String[] args) {
        PrintSSq("abc","");
    }
}
