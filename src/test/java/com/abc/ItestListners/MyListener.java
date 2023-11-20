package com.abc.ItestListners;

//30-Oct
//MyListner class is implementing ITestListener. After writing the class statement, import addITest* files by doing the below: click on 
//"Source" -> Override Implement methods and can select the methods declared in the ITestListener interface. After taht we can delete
//the content within the methods
//

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		//it is be called on the beginning of all tests
		System.out.println("Test being executed:  " +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
//		it is executed when test case is passed
			}

	@Override
	public void onTestFailure(ITestResult result) {
//		it is executed when test case is failed
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
//		it is executed when test case is skipped
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// it is being executed when the testcase doesnt get executed within the specified timeout .
	}

	@Override
	public void onStart(ITestContext context) {
		// this is executed Only once in the beginning before executing any test case
		System.out.println("Test execution begins sooner");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// this is executed Only once in the ending after executing all test case
		System.out.println("Test execution is completed successfully");
		
	}

}
