package TestNGListeners;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ITmainListeners {

	WebDriver driver;
	
	@Test
	public void test() {
		System.out.println("Hello world");;
		Assert.assertTrue(true);            //pass ho jaegi
	}
	
	@Test
	public void  test2() {
		System.out.println("This is test 2 method");
		Assert.assertTrue(false);           // fail karwa rae h ham isme
	}
	
	@Test
	public void  test3() {
		System.out.println("This is test 3 method");
		throw new SkipException("skip method");	          // skip ho jaegi
	}
	
}
