// Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
// -- see Introduction to Mod

public class Or35 {

    public static void main(String[] args){
        Or35 start = new Or35();
        start.init();
    }

    private void init(){
        // array to hold inputs
        int[] ins = { 3,10,815,5,9,4,7,6,17,18,29,20,21,22,45,99,100,101,121,122,123 };
        //for each format
        for (int i : ins){
            System.out.println(String.format("n = %d : %b", i, or35(i)));
        }
    }

    private boolean or35(int n){
        // return logic
        return (n%3 == 0) || (n%5 == 0);
    }
}
