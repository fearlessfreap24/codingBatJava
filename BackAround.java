// Given a string, take the last char and return a new string with the last char added at the front and back, so "cat"
// yields "tcatt". The original string will be length 1 or more.

public class BackAround {

    public static void main(String[] args){
        BackAround start = new BackAround();
        start.init();
    }

    private void init(){
        // array to hold inputs
        String[] ins = { "cat", "Hello", "a", "abc", "read", "boo" };
        // for each format
        for (String i : ins){
            System.out.println(String.format("str = %s : %s", i, backAround(i)));
        }
    }

    private String backAround(String str){
        // check if string is longer than 1 character
        if (str.length()<2) return str + str + str;
        else {
            // variable to hold last character of string
            String lastone = str.substring(str.length()-1);
            return lastone + str + lastone;
        }
    }
}
