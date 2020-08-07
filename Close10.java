//Given 2 int values, return whichever value is nearest to the value 10,
//or return 0 in the event of a tie. Note that Math.abs(n)
//returns the absolute value of a number.
//
//
//close10(8, 13) → 8
//close10(13, 8) → 8
//close10(13, 7) → 0


public class Close10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Close10 letsgo = new Close10();
		letsgo.run();

	}
	
	private void run() {
		System.out.println(close10(8,13));
		System.out.println(close10(13,8));
		System.out.println(close10(13,7));
	}
	
	private int close10(int a, int b) {
		int modA = Math.abs(10 - Math.abs(a));
		int modB = Math.abs(10 - Math.abs(b));
		
		if (modA == modB) return 0;
		else if (modA < modB) return a;
		else return b;
	}

}
