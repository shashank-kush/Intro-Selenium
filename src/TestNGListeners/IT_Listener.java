package TestNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class IT_Listener implements ITestListener{              // IT_Demo_Listener class

	
	
	// Extent report ka use listeners class ke andar hi hota h
	
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void ConfigureReport() {
		//Extent Report.html     isi name se report generate ho jaegi
				//htmlReporter = new ExtentSparkReporter("Extent Report.html");    
				htmlReporter = new ExtentSparkReporter("D:\\Desktop\\Extent_Report");         //  D:\\Desktop\\Extent_Report - if we want to save report in particular file
				reports = new ExtentReports();
				reports.attachReporter(htmlReporter);
				
				//add environmental details
				//add system information
				
				reports.setSystemInfo("Machine", "testpc");
				reports.setSystemInfo("OS", "Windows");
				reports.setSystemInfo("Name", "Shashank");
				
				//change the look and field
				//add configuration 
				htmlReporter.config().setDocumentTitle("Extent Report");
				htmlReporter.config().setReportName("Automation");
				htmlReporter.config().setTheme(Theme.DARK);
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart executed");
	}

	@Override
	public void onTestSuccess(ITestResult result) {          // based on the o/p result ye automatic execute ho jaegi, pass method ke liye
		System.out.println("name of method passed "+ result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of the method pass: "+result.getName(),ExtentColor.GREEN));
	}

	@Override
	public void onTestFailure(ITestResult result) {				// based on the o/p result ye automatic execute ho jaegi, fail method ke liye
		System.out.println("name of method failed "+ result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of the method fail: "+result.getName(),ExtentColor.RED));
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test = reports.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the method skip: "+result.getName(),ExtentColor.YELLOW));
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStart(ITestContext context) {
		ConfigureReport();
		System.out.println("onStart executed");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("on completed");
		reports.flush(); 
	}

	

	
	
}
