package triangle_unit_tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestSuite implements ITest {
	TestSuite(String name) {
		this.name = name;
	}

	private String name;

	private List<ITest> testSuite = new ArrayList<ITest>();

	public List<ITest> add(ITest t) {
		testSuite.add(t);

		return testSuite;
	}

	public List<ITestResult> test() {
		ArrayList<TestResult> resultLst = new ArrayList<TestResult>();
		for (ITest t : testSuite) {
			List<ITestResult> result = t.test();
			resultLst.addAll(result);
		}
//		String[] resultArr = new String[resultLst.size()];
//
//		int index = 0;
//		for (String s : resultLst) {
//			resultArr[index] = getName() + "." + s;
//			index++;
//		}

		return resultLst;
	}

	public String getName() {
		return this.name;
	}

}