package testNGexecutionorder;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PrioritiseExample {

	@Test
	public void testone() {
		System.out.println("Test 1 executed");
	}
	
	@Test(priority=1)
	public void testSecond() {
		System.out.println("Test 2 executed");
	}
	
	@Test(priority=2)
	public void testThird() {
		System.out.println("Test 3 executed");
		
	}
	
	@Test(priority=3)
	public void testFourth() {
		System.out.println("Test 4 executed");
	}
	
}
