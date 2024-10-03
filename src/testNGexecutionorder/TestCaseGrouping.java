package testNGexecutionorder;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCaseGrouping {

	@Test(groups={"Regression"})
	public void testone() {
		System.out.println("Test 1 - Regression");
	}
	
	@Test(groups={"Sanity"})
	public void testSecond() {
		System.out.println("Test 2 - Regression");
	}
	
	@Test(groups={"Smoke"})
	public void testThird() {
		System.out.println("Test 3 - Smoke");
		
	}
	
	@Test(groups={"Regression","Sanity"})
	public void testFourth() {
		System.out.println("Test 4 - Regression & Sanity");
	}
	
}
