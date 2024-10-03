package Testng;

import org.testng.annotations.*;

public class Newtry {

	@BeforeSuite
	public void beforesuit() {
		System.out.println("beforesuit is working");
	}
	
	@Test
	public void main() {
		System.out.println("sk");
	}
	
	@AfterSuite
	public void aftersuit() {
		System.out.println("aftersuit is working");
	}
}
