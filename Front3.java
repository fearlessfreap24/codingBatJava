// Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3,
// the front is whatever is there. Return a new string which is 3 copies of the front.

public class Front3 {

    public static void main(String[] args){
        Front3 start = new Front3();
        start.init();
    }

    private void init(){
        // array to hold inputs
        String[] ins = { "Java", "Chocolate", "abc", "abcXYZ", "ab", "a", "" };
        // for each format
        for (String i : ins){
            System.out.println(String.format("str = %s : %s", i, front3(i)));
        }
    }

    private String front3(String str){
        if (str.length() < 3) return str + str + str;
        else {
            String ret = str.substring(0,3);
            return ret + ret + ret;
        }
    }
}
