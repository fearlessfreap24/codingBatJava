
public class LoneTeen {

	public static void main(String[] args) {
		LoneTeen start = new LoneTeen();
		start.init();
	}

	private void init() {
		// array to hold inputs
		int[][] ins = { {13,99}, {21,19}, {13,13}, {14,20}, {20,15}, {16,17}, {16,9}, {16,18}, {13,19}, 
				{13,20}, {6,18}, {99,13}, {99,99} };
		// for each format
		for (int[] i: ins) {
			System.out.println(String.format("a %d, b %d : %b", i[0], i[1], loneTeen(i[0], i[1])));
		}
	}

	private boolean loneTeen(int a, int b) {
		return ( a >= 13 && a <= 19 && (b < 13 || b > 19) )
				|| ( b >= 13 && b <= 19 && (a < 13 || a > 19) );
	}

}
