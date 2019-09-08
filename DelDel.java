// Given a string, if the string "del" appears starting at index 1, return a string where that 
// "del" has been deleted. Otherwise, return the string unchanged.

public class DelDel {

	public static void main(String[] args) {
		DelDel start = new DelDel();
		start.init();
	}

	private void init() {
		// array to hold inputs
		String[] ins = { "adelbc", "adelHello", "adedbc" };
		// for each format
		for (String i: ins) {
			System.out.println(String.format("str %s : %s", i, delDel(i)));
		}
	}

	private String delDel(String str) {
		// check to see if string is long enough
		if (str.length() < 4) return str;
		else return str.substring(1,4).equals("del") ? str.substring(0,1) + str.substring(4): str ;
	}

}
