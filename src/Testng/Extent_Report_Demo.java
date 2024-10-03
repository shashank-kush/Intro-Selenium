package Testng;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Report_Demo {

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeMethod
	public void startReport() {
		//Extent Report.html     isi name se report generate ho jaegi
		//htmlReporter = new ExtentSparkReporter("Extent Report.html");    
		htmlReporter = new ExtentSparkReporter("D:\\Desktop\\Extent_Report");         //  D:\\Desktop\\Extent_Report - if we want to save report in particular file
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//add environmental details
		//add system information
		
		reports.setSystemInfo("Machine", "testpc");
		reports.setSystemInfo("OS", "Windows");
		reports.setSystemInfo("browser", "chrome");
		reports.setSystemInfo("username", "Aman");
		
		//cahnge the look and field
		//add configuration 
		htmlReporter.config().setDocumentTitle("Extent Listener Report Demo");
		htmlReporter.config().setReportName("This is my 1st Report");
		htmlReporter.config().setTheme(Theme.DARK);
	}
	
	@Test
	public void verifyTitle() {
		test = reports.createTest("Verify the Title of webpage");
		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void getTestResult(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"Fail", ExtentColor.RED));
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"PASS", ExtentColor.GREEN));
		}
	}
	
	@AfterTest
	public void tearDown() {
		reports.flush();                   // Extent report me - ye last me is method ko likhna jaruri h tbhi report generate hogi 
		
	}
	
}











