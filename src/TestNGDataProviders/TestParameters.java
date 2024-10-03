package TestNGDataProviders;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {

	@Test
	@Parameters("browser")
	public void TestcaseOne(String browser) {
		System.out.println("browser passed as :- "+ browser);
	}
	
	@Test
	@Parameters({"username","password"})
	public void TestcaseSecond(String username, String password) {
		System.out.println("Username is:- "+ username);
		System.out.println("Password is :- "+ password);
	}
	
}
