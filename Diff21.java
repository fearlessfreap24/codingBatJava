// Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n
// is over 21.

public class Diff21 {

    public static void main(String[] args){
        Diff21 start = new Diff21();
        start.init();
    }

    private void init(){
        // array for input
        int[] ins = { 19, 10, 21, 22, 25, 30, 0, 1, 2, -1, -2, 50};
        // for each statement to run diff21 method
        for(int i: ins){
            System.out.println(String.format("n = %d : %d", i, diff21(i)));
        }
    }

    private int diff21(int n){
        // use ternary statement for return
        return n > 21 ? (n-21)*2 : 21-n;
    }
}
