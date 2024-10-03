package TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DemoListenersExample implements ITestListener {

	// right click on DemoListenersExample then source then override/implement methods then click all, to ye niche vale saari methods apne se a jaengi

	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test is started :- "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test got successfull :- "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test got failed :- "+ result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test got skipped :- "+ result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart method executed");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Completed");
	}
	
	
}
