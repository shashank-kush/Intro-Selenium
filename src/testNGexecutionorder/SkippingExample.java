package testNGexecutionorder;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingExample {

	@Test(enabled=false)
	public void testone() {
		System.out.println("Test 1 executed");
	}
	
	@Test
	public void testSecond() {
		System.out.println("Test 2 executed");
	}
	
	@Test
	public void testThird() {
		System.out.println("Test 3 executed");
		throw new SkipException("maintenance going on this TC");
	}
	
	@Test
	public void testFourth() {
		System.out.println("Test 4 executed");
	}
	
	
}
