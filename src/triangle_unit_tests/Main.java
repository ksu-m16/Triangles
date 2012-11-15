package triangle_unit_tests;

import java.util.*;

public class Main {
	
	//thats my awesome branch but it doesnt work =(	
	//Mega change in vetka 1
	//Mega change in branch 2))

	public static void main(String[] args) {
		TestSuite ts1 = new TestSuite("Func. Tests");
		int i = 0;
		int i2 = 2;
		TestSuite ts = new TestSuite("General Testsuite");
		TestSuite ts2 = new TestSuite("Test Args Count");
		TestSuite ts3 = new TestSuite("Test Arguments Verification");
		ts1.add(new TestArgsSum("3", "4", "3"));
		ts1.add(new TestArgsSum("1", "1", "1"));
		ts1.add(new TestArgsSum("1", "3", "2"));
		ts1.add(new TestArgsSum(1, 2, 4));
		
		ts2.add(new TestArgCount(3));
		ts2.add(new TestArgCount(1));
		ts2.add(new TestArgCount(5));
		ts2.add(new TestArgCount(0));
		ts2.add(new TestArgCount(100500));
		
		ts3.add(new ArgsVerification(new String[] {"1", "2", "3"}));
		ts3.add(new ArgsVerification(new String[] {"1a", "2", "3"}));
		ts3.add(new ArgsVerification(new String[] {"1", "2.2", "3"}));
		
		ts.add(ts1);
		ts.add(ts2);
		ts.add(ts3);
		
		List<ITestResult> results = ts.test();

		for (ITestResult res : results) {
			System.out.println(res.getMessage());
		}
	}
}
