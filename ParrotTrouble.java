// We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble
// if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

public class ParrotTrouble {

    public static void main(String[] args){
        ParrotTrouble start = new ParrotTrouble();
        start.init();
    }

    private void init(){
        // arrays for holding inputs
        boolean[] talking = { true, true, false, true, false, false, true, false, true, false};
        int[] hour = { 6, 7, 6, 21, 21, 20, 23, 23, 20, 12 };

        //for loop to iterate through inputs. can't use for each because there are different input types.
        for( int i=0;i<talking.length;i++){
            System.out.println(String.format("talking = %b, hour = %d : %b", talking[i], hour[i],
                    parrotTrouble(talking[i], hour[i])));
        }
    }

    private boolean parrotTrouble(boolean talking, int hour){
        // return logic
        return (hour < 7 || hour > 20) && talking;
    }
}
