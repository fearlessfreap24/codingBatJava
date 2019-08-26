// The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep
// in if it is not a weekday or we're on vacation. Return true if we sleep in.

public class SleepIn {

    public static void main(String[] args){
        SleepIn start = new SleepIn();
        start.init();
    }

    private void init(){
        boolean[][] ins = { {false,false}, {true,false}, {false,true}, {true,true}};
        for (int i=0;i<ins.length;i++){
            System.out.println(String.format("Weekday = %b, Vacation = %b: Answer = %b", ins[i][0], ins[i][1],
                    sleepIn(ins[i][0], ins[i][1])));
        }
    }

    private boolean sleepIn(boolean weekday, boolean vacation){
        return (vacation) || (!weekday);
    }
}
