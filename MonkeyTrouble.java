// We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if
// they are both smiling or if neither of them is smiling. Return true if we are in trouble.

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
