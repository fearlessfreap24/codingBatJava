// We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
// Given 3 int values, return true if 1 or more of them are teen.

public class HasTeen {

	public static void main(String[] args) {
		HasTeen start = new HasTeen();
		start.init();
	}

	private void init() {
		// array to hold inputs
		int [][] ins = { {13,20,10}, {20,19,10}, {20,10,13}, {1,20,12}, 
				{19,20,12}, {12,20,19}, {12,9,20}, {12,18,20}, {14,2,20}, 
				{4,2,20}, {11,22,22} };
		// for each format
		for (int[] i:ins) {
			System.out.println(String.format("a %d, b %d, c %d : %b", i[0], 
					i[1], i[2], hasTeen(i[0], i[1], i[2])));
		}
	}

	private boolean hasTeen(int a, int b, int c) {
		return ( a >= 13 && a <= 19 ) || ( b >= 13 && b <= 19 ) ||
				( c >= 13 && c <= 19 );
	}

}
