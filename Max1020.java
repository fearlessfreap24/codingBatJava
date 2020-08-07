//Given 2 positive int values, return the larger value 
//that is in the range 10..20 inclusive, or return 0 if 
//neither is in that range.
//
//
//max1020(11, 19) → 19
//max1020(19, 11) → 19
//max1020(11, 9) → 11


public class Max1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Max1020 start = new Max1020();
		start.run();

	}
	
	private void run() {
		System.out.println(max1020(11, 19));
		System.out.println(max1020(19, 11));
		System.out.println(max1020(11, 9));
	}
	
	private int max1020(int a, int b) {
		if ( ( a >= 10 && a <= 20 ) && ( b >= 10 && b <= 20 ) ) {
			return Math.max(a, b);
		}
		if ( ( a >=10 && a <= 20 ) && ( b < 10 || b > 20 ) ) {
			return a;
		}
		if ( ( a < 10 || a > 20 ) && ( b >=10 && b <= 20 ) ) {
			return b;
		}
		return 0;
	}

}
