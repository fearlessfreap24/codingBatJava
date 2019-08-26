// Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

public class Makes10 {

    public static void main(String[] args){
        Makes10 start = new Makes10();
        start.init();
    }

    private void init(){
        // 2d array to hold inputs
        int[][] ins = {
                {9,10},
                {9,9},
                {1,9},
                {10,1},
                {10,10},
                {8,2},
                {8,3},
                {10,42},
                {12,-2}
        };

        //foreach format because both inputs are the same type
        for(int[] i : ins){
            System.out.println(String.format("a = %d, b = %d : %b", i[0], i[1], makes10(i[0], i[1])));
        }
    }

    private boolean makes10(int a, int b){
        //return logic
        return ( a == 10 || b == 10) || a + b == 10;
    }
}
