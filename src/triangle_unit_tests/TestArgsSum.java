package triangle_unit_tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArgsSum implements ITest {
	private String name = this.getClass().getName();

	private String[] args = new String[3];

	TestArgsSum(String a, String b, String c) {
		args[0] = a;
		args[1] = b;
		args[2] = c;
	}

	TestArgsSum(double a, double b, double c) {
		args[0] = Double.toString(a);
		args[1] = Double.toString(b);
		args[2] = Double.toString(c);
	}

	TestArgsSum(int a, int b, int c) {
		args[0] = Integer.toString(a);
		args[1] = Integer.toString(b);
		args[2] = Integer.toString(c);
	}

	public List<ITestResult> test() {
		List<ITestResult> result = new ArrayList();
	    boolean passed = false;
        String message = "";
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		isPossible = (a - b < c && c - a < b && b - a < c);
		if()
		ITestResult res = new TestResult(passed, name, message);
//		result[0] = this.getName()
//				+ Arrays.toString(args)
//				+ "."
//				+ ((isPossible == CheckTriangle.check(args)) ? "passed"
//						: "failed");
		result.add(res);
		return result;

	} // Массив результатов passed/failed

	public String getName() {
		return this.name;
	}
}