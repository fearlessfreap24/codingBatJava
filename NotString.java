// Given a string, return a new string where "not " has been added to the front. However, if the string already begins
// with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

public class NotString {

    public static void main(String[] args){
        NotString start = new NotString();
        start.init();
    }

    private void init(){
        // array to hold inputs
        String[] ins = { "candy", "x", "not bad", "bad", "not", "is not", "no" };

        // for each format
        for (String i : ins){
            System.out.println(String.format("str = %s : %s", i, notString(i)));
        }

    }

    private String notString(String str){
        // check length of string
        if (str.length() < 3) return "not " + str;
        // check if string starts with "not"
        else if (str.substring(0,3).equals("not")) return str;
        // if it doesn't start with "not" add "not " to string
        else return "not " + str;
    }
}
