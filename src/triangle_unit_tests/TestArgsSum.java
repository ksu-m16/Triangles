package triangle_unit_tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import checker.CheckTriangle;

public class TestArgsSum implements ITest {
	private String name = this.getClass().getName();
	boolean passed = false;
    String message = "";

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
		List<ITestResult> result = new ArrayList<ITestResult>();
	    
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		boolean isPossible = (a - b < c && c - a < b && b - a < c);
		passed = (isPossible == CheckTriangle.check(args));
		message = this.getName() + Arrays.toString(args) + 
				"." + (passed ? "passed." : "failed.");
		
		
		ITestResult res = new TestResult(name, passed, message);
//		result[0] = this.getName()
//				+ Arrays.toString(args)
//				+ "."
//				+ ((isPossible == CheckTriangle.check(args)) ? "passed"
//						: "failed");
		result.add(res);
		return result;

	} // ������ ����������� passed/failed

	public String getName() {
		return this.name;
	}
}