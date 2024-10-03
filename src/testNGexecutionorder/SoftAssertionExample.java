package testNGexecutionorder;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class SoftAssertionExample {

	@Test(priority=1)
	public void testone() {
		SoftAssert softAssert = new SoftAssert();               // SoftAssert name ki inbuilt class hoti h
		System.out.println("Test 1 executed");
		softAssert.assertEquals(5, 5, "1st hard assert failed");
		System.out.println("soft assert Success");
		softAssert.assertTrue("Hello".equalsIgnoreCase("hello"), "2 hard assert failed");
		System.out.println("TC 1 executed successfully");
		softAssert.assertAll();          // last me ye use krna jaruei h softassertion me varna fail hona rhta h jisko vo failshow nhi krega
	}
	
	@Test(priority=3)
	public void testSecond() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Test 2 executed");
		softAssert.assertEquals("Hello", "Hello", "2nd soft assert failed");
		System.out.println("soft assert Success");
		softAssert.assertTrue(false, "2 hard assert failed");
		System.out.println("TC 2 executed successfully");
		softAssert.assertAll();
	}
	
	@Test(priority=2)
	public void testThird() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Test 3 executed");
		softAssert.assertEquals(5, 5, "3rd hard assert failed");
		System.out.println("hard assert Success");
		softAssert.assertTrue("Hello".equals("hello"), "3 hard assert failed");
		System.out.println("TC 3 executed successfully");
		softAssert.assertAll();
	}
	
}
