// Given three int values, a b c, return the largest.

public class IntMax {

	public static void main(String[] args) {
		IntMax start = new IntMax();
		start.init();
	}

	private void init() {
		// array to hold input
		int[][] ins = { {1, 2, 3}, {1, 3, 2}, {3, 2, 1} };
		// for each format
		for (int[] i: ins) {
			System.out.println(String.format("a %d, b %d, c %d : %d", i[0], i[1], i[2], intMax(i[0], i[1], i[2])));
		}
	}

	private Object intMax(int a, int b, int c) {
		// 
		int max = 0;
		if ( a > max ) max = a;
		if ( b > max ) max = b;
		if ( c > max ) max = c;
		
		return max;
	}

}
