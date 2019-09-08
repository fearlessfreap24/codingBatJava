// Return true if the given string begins with "mix", except the 'm' can be anything, so
// "pix", "9ix" .. all count.
public class MixStart {

	public static void main(String[] args) {
		MixStart start = new MixStart();
		start.init();
	}

	private void init() {
		// array to hold inputs
		String[] ins = { "mix snacks", "pix snacks", "piz snacks" };
		// for each format
		for (String i: ins) {
			System.out.println(String.format("str \"%s\" : %b", i, mixStart(i)));
		}
	}

	private boolean mixStart(String str) {
		if ( str.length() < 3) return false;
		else return str.substring(1, 3).contentEquals("ix");
		
	}

}
