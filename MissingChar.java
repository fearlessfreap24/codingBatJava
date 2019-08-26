// Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value
// of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1
// inclusive).

public class MissingChar {

    public static void main(String[] args){
        MissingChar start = new MissingChar();
        start.init();
    }

    private void init(){
        // array to hold string inputs
        String[] strs = { "kitten", "kitten", "kitten" };
        // array to hole integer inputs
        int[] ints = { 1,0,4 };

        // standard for loop format
        for (int i=0;i<strs.length;i++){
            System.out.println(String.format("str = %s, n = %d : %s", strs[i], ints[i],
                    missingChar(strs[i], ints[i])));
        }
    }

    private String missingChar(String str, int n){
        // break input string into character array
        char[] arr = str.toCharArray();
        // variable to be returned
        String ret = "";
        // loop over character array
        for (int i=0;i<arr.length;i++){
            // as long as i does not equal n, concatenate arr[i] to return variable
            if (i != n) ret = ret + arr[i];
        }
        // return the finished variable
        return ret;
    }
}
