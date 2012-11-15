package triangle_unit_tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import checker.CheckTriangle;

public class ArgsVerification implements ITest{
	ArgsVerification(String[] args) {
		this.args = args;
	}
	
	private String[] args;
	private String name = this.getClass().getName();
	boolean passed = false;
    String message = "";

	@Override
	public List<ITestResult> test() {
			
			List<ITestResult> result = new ArrayList<ITestResult>();
			
			boolean areValid = true;
			String message = "";
			
			for (int i = 0; i < args.length; i++) {
				if (!verifyArgument(args[i])) {
					areValid = false;
					break;
				}
			}

			try {
				CheckTriangle.check(args);
				passed = areValid;
			}
			
			catch (NumberFormatException e) {
				passed = false;
			}
			
			catch (IllegalArgumentException e) {
				passed = !areValid;
			}
			
			catch (Exception e) {
				passed = false;
			}

			message = this.getName() + Arrays.toString(args) + 
					(passed ? ".passed." : ".failed.");
			
			ITestResult res = new TestResult(name, passed, message);

			result.add(res);
			return result;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	private boolean verifyArgument(String arg) {

		try {
			Integer.parseInt(arg.trim());
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}
		
		
	}

}
