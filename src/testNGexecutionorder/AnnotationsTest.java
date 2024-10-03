package testNGexecutionorder;

import org.testng.annotations.*;

public class AnnotationsTest {

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void first() {
		System.out.println("Test");
	}
	@Test
	public void Second() {
		System.out.println("Second Test");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
	}
}
