package serosoft;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class hooks implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+ " Is started");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+ " Is successfully completed");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+ " Is Failed");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println(context.getName()+ " Is Finished");
		
	}
	

}
