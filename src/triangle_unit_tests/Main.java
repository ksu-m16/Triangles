package triangle_unit_tests;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		TestSuite ts1 = new TestSuite("Func. Tests");
		TestSuite ts = new TestSuite("General Testsuite");
		TestSuite ts2 = new TestSuite("Test Args Count");
		ts1.add(new TestArgsSum("3", "4", "3"));
		ts1.add(new TestArgsSum("1", "1", "1"));
		ts1.add(new TestArgsSum("1", "3", "2"));
		ts1.add(new TestArgsSum(1, 2, 4));
		
		ts2.add(new TestArgCount(3));
		ts2.add(new TestArgCount(1));
		ts2.add(new TestArgCount(5));
		ts2.add(new TestArgCount(0));
		ts2.add(new TestArgCount(100500));
		
		ts.add(ts1);
		ts.add(ts2);
		
		List<ITestResult> results = ts.test();

		for (ITestResult res : results) {
			System.out.println(res.getMessage());
		}
	}
}
