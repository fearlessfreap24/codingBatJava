// Given two int values, return their sum. Unless the two values are the same, then return double their sum.

public class SumDouble {

    public static void main(String[] args){
        SumDouble start = new SumDouble();
        start.init();
    }

    private void init(){
        // 2d int array for input
        int[][] ins = {
                {1, 2},
                {3, 2},
                {2, 2},
                {-1, 0},
                {3, 3},
                {0, 0},
                {0, 1},
                {3, 4}
        };

        // foreach statement
        for (int[] i: ins){
            System.out.println(String.format("a = %d, b = %d : %d", i[0], i[1], sumDouble(i[0], i[1])));
        }
    }

    private int sumDouble(int a, int b){
        // used ternary operator to streamline
        return a == b ? a*2*2 : (a+b);
    }
}
