package triangle_unit_tests;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		TestSuite ts = new TestSuite("tsName");
		TestSuite ts1 = new TestSuite("ts1Name");
		TestSuite ts2 = new TestSuite("ts2Name");
		ts.add(new TestArgsSum("3", "4", "3"));
		ts.add(new TestArgsSum("1", "1", "1"));
		ts.add(new TestArgsSum("1", "3", "2"));
		ts.add(new TestArgsSum(1, 2, 4));
		ts1.add(ts);
		ts2.add(new TestArgsSum(1, 5, 2));
		ts2.add(ts1);
		List<ITestResult> results = ts2.test();

		for (ITestResult res : results) {
			System.out.println(res.getMessage());
		}
	}
}
