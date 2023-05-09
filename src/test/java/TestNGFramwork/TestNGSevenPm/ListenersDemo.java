package TestNGFramwork.TestNGSevenPm;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("Instructions while starting the test");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Passed ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Take SCreenshot and Retry the test cases");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case got skipped ");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

		System.out.println("Test execution is going to start ");

	}

	@Override
	public void onFinish(ITestContext context) {

		System.out.println("Test execution completed ");

	}

}
