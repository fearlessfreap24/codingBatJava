public class NearHundred {

    public static void main(String[] args){
        NearHundred start = new NearHundred();
        start.init();
    }

    private void init(){
        int[] ins = { 93,90,89,110,111,121,-101,-209,190,209,5,-50,191,189,200,210,211,290 };
        for(int i : ins){
            System.out.println(String.format("n = %d : %b", i, nearHundred(i)));
        }
    }

    private boolean nearHundred(int n){
        // get absolute value of 100-n and 200-n
        int twoabs = Math.abs(200-n);
        int oneabs = Math.abs(100-n);

        // return true if absolute value is less than or equal to 10
        // this could all be one statement:
        // return Math.abs(200-n) <= 10 || Math.abs(100-n) <= 10;
        return twoabs <= 10 || oneabs <= 10;
    }
}
