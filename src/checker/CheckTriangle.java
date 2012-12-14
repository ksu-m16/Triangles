package checker;

/// change
//  change

public class CheckTriangle {
	public static boolean check(String[] args) throws IllegalArgumentException {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
//		return a - b < c && c - a < b && b - a < c;
		return a < b + c && c < a + b && b < a + c;
	}
}