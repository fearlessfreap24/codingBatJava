// Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, 
// so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

public class Front22 {

	public static void main(String[] args) {
		Front22 start = new Front22();
		start.init();

	}

	private void init() {
		// array to hold inputs
		String[] ins = { "kitten", "ha", "abc", "ab", "a", "", "Logic" };
		// for each format
		for (String i: ins) {
			System.out.println(String.format("str = %s : %s", i, front22(i)));
		}
	}

	private String front22(String str) {

		if (str.length()<2) return str+str+str;
		else {
			String two = str.substring(0,2);
			return two + str + two;
		}
	}

}
