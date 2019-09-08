// Given 2 int values, return true if either of them is in the range 10..20 inclusive.

public class In1020 {

	public static void main(String[] args) {
		In1020 start = new In1020();
		start.init();

	}

	private void init() {
		// array to hold inputs
		int[][] ins = { {12,99}, {21,12}, {8,99}, {99,10}, {20,20}, {9,9} };
		// foreach format
		for (int[] i: ins) {
			System.out.println(String.format("a %d, b %d : %b", i[0], i[1], in1020(i[0], i[1])));
		}
		
	}

	private boolean in1020(int a, int b) {
		return ( a >= 10 && a <=20 ) || ( b >= 10 && b <=20 );
	}

}
