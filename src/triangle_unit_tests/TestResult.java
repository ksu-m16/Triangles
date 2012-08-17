package triangle_unit_tests;

public class TestResult implements ITestResult {

	private String name;
	private boolean passed = false;
	private String message;

	TestResult(String name, boolean passed, String message){
		this.name = name;
		this.passed = passed;
		this.message = message;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public boolean isPassed() {
		// TODO Auto-generated method stub
		return passed;
	}

}
