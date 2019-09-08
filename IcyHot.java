// Given two temperatures, return true if one is less than 0 and the other is greater than 100.
public class IcyHot {

	public static void main(String[] args) {
		IcyHot start = new IcyHot();
		start.init();
	}

	private void init() {
		// array to hold inputs
		int[][] ins = { {120,-1}, {-1,120}, {2,120}, {-1,100}, {-2,-2}, {120,120} };
		// for each format,-
		for (int[] i: ins) {
			System.out.println(String.format("temp1 %d, temp2 %d : %b", i[0], i[1], icyHot(i[0], i[1])));
		}
		
		
	}

	private boolean icyHot(int temp1, int temp2) {
		return ( temp1 < 0 && temp2 > 100) || ( temp1 > 100 && temp2 < 0 );
	}

}
