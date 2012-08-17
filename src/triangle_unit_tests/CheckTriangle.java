package triangle_unit_tests;

public class CheckTriangle {
	public static boolean check(String[] args) throws IllegalArgumentException {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		return a - b < c && c - a < b && b - a < c;
	}
}