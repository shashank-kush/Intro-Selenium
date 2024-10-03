package testNGexecutionorder;
import org.testng.annotations.Test;
import junit.framework.Assert;
public class HardAssertionExample {

	@Test
	public void testone() {
		System.out.println("Test 1 executed");
		Assert.assertEquals("fbs", "fbs");
	}
	
	@Test(priority=1)
	public void testSecond() {
		System.out.println("Test 2 executed");
		Assert.assertEquals(404, 202);
	}
	
	@Test(priority=2)
	public void testThird() {
		System.out.println("Test 3 executed");
		Assert.assertTrue(true);
	}
	
	@Test(priority=3)
	public void testFourth() {
		System.out.println("Test 4 executed");
		Assert.assertTrue("making Test failure", false);
	}
	
}
