// Given a string, return a string made of the first 2 chars (if present), however include 
// first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" 
// yields "oz".

public class StartOz {

	public static void main(String[] args) {
		StartOz start = new StartOz();
		start.init();
	}

	private void init() {
		// array to hold inputs
		String[] ins = { "ozymandias", "bzoo", "oxx", "oz", "ounce", "o", "abc", "",
				"zoo", "aztec", "zzzz", "oznic" };
		// for each format
		for (String i: ins) {
			System.out.println(String.format("str %s : %s", i, startOz(i)));
		}
	}

	private String startOz(String str) {
		// variable for the length of input
		int strl = str.length();
		// char array for the input to be able to compare
		char[] ca = str.toCharArray();
		// if input length is zero, return empty string. clear indexOutOfBounds errors
		if (strl == 0) return "";
		// comparisons for input longer than 1 character.
		else if (strl > 1) {
			if (ca[0] == 'o' && ca[1] == 'z') return "oz";
			else if (ca[1] == 'z') return "z";
			else if (ca[0] == 'o') return "o";
		}
		// comparison for single character input.
		else if (strl < 2 && ca[0] == 'o') return "o";
		
		return "";
	}

}
