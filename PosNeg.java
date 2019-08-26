//Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true,
// then return true only if both are negative.

public class PosNeg {

    public static void main(String[] args){
        PosNeg start = new PosNeg();
        start.init();
    }

    private void init(){
        // arrays to hold inputs
        int[][] ins = {
                {1,-1},
                {-1,1},
                {-4,-5}
        };
        boolean[] negs = { false, false, true };

        // for loop to iterate inputs into posNeg. Can't use for each format because 2 different input types.
        for (int i=0;i<ins.length;i++){
            System.out.println(String.format("a = %d, b = %d, negative = %b : %b", ins[i][0], ins[i][1], negs[i],
                    posNeg(ins[i][0], ins[i][1], negs[i])));
        }
    }

    private boolean posNeg(int a, int b, boolean negative){
        // return logic
        return (!negative && ((a < 0 && b >= 0) || (b < 0 && a >= 0))) || (negative && a <0 && b < 0);
    }
}
