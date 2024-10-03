package testNGexecutionorder;

import org.testng.annotations.*;

public class SampleTestng {
	
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test");
	}
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	
}
