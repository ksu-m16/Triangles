package triangle_unit_tests;

import java.util.ArrayList;
import java.util.List;

import checker.CheckTriangle;

public class TestArgCount implements ITest {
	private String name = this.getClass().getName();
	boolean passed = false;
    String message = "";

	private int count;

	TestArgCount(int count) {
		this.count = count;
	}

	public List<ITestResult> test() {
		
		List<ITestResult> result = new ArrayList<ITestResult>();
		
		String[] testArgs = new String[count];
		for (int i = 0; i < count; i++) {
			testArgs[i] =  "2";
		}
		
		try {
			boolean checkerOutput = CheckTriangle.check(testArgs);
			
			passed = (count == 3) && (checkerOutput == true);
			
		}
		catch (IllegalArgumentException e) {
			passed = (count != 3);
		}
		catch (Exception e) {
			passed = false;
		}

		message = this.getName() + "[" + count + 
				" args]." + (passed ? "passed." : "failed.");
		
		
		ITestResult res = new TestResult(name, passed, message);

		result.add(res);
		return result;

	} 

	public String getName() {
		return this.name;
	}
}
