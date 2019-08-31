// Given a string, return true if the string starts with "hi" and false otherwise.

public class StartHi {

	public static void main(String[] args) {

		StartHi start = new StartHi();
		start.init();

	}

	private void init() {

		// array to hold inputs
		String[] ins = { "hi there", "hi", "hello hi", "he", "h", "", "ho hi","hi ho" };
		// for each format
		for (String str : ins) {
			System.out.println(String.format("str = %s : %b", str, startHi(str)));;
		}
		
	}

	private Object startHi(String str) {
		// if string is less than 2 return false
		if (str.length()<2) return false;
		// logic for return
		else {
			return str.substring(0, 2).equals("hi");
		}
	}

}
