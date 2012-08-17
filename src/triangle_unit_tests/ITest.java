package triangle_unit_tests;

import java.util.List;

public interface ITest {
	List<ITestResult> test(); 
	String getName();
}