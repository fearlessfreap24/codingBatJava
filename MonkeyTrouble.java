public class MonkeyTrouble {

    public static void main(String[] args){
        MonkeyTrouble start = new MonkeyTrouble();
        start.init();
    }

    private void init(){
        // 2d array for input
        boolean[][] ins = {
                {true,true},
                {false,false},
                {true,false},
                {false,true}
        };

        // used this foreach for practice.
        for (boolean[] i:ins) {
            System.out.println(String.format("aSmile = %b, bSmile = %b: %b", i[0], i[1], monkeyTrouble(i[0], i[1])));
        }
    }

    private boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        return aSmile == bSmile;
    }
}
