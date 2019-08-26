// Given a string, return a new string where the first and last chars have been exchanged.

public class FrontBack {

    public static void main(String[]args){
        FrontBack start = new FrontBack();
        start.init();
    }

    private void init(){
        // array to hold inputs
        String[] ins = { "code", "a", "ab", "abc", "", "Chocolate", "aavJ", "hello" };
        //for each format to iterate inputs to method
        for(String i : ins){
            System.out.println(String.format("str = %s : %s", i, frontBack(i)));
        }
    }

    private String frontBack(String str){
        // check if string is only one character or empty
        if (str.length() < 2) return str;
        else return str.substring(str.length()-1) + str.substring(1,str.length()-1) + str.substring(0,1);
    }
}
