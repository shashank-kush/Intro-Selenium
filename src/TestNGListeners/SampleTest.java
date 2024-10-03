package TestNGListeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void testOne() {
		System.out.println("I am TestOne");
	}
	
	@Test(dataProvider = "dataprovider")
	public void testGetData(String s) {
		System.out.println("Test GetDAta method, input = "+ s);
	}
	
	@DataProvider
	public Object[] dataprovider() {
		return new Object[] {"A", "B"};
	}
	
	@Test
	public void TestThree() {
		Assert.assertEquals(5, 7);
	}
	
	@Test
	public void TestFour() {
		throw new SkipException(null);
	}
	
}
