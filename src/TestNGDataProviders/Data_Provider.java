package TestNGDataProviders;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	/*@Test(dataProvider = "getData")
	public void testAddition(int actual, int expected) {
		int actualValue = actual + 20;
		Assert.assertEquals(actualValue, expected);
	}

	@DataProvider(name = "getData")
	public Object[][] getData() {
		return new Object[][] { { 100, 120 }, { 420, 450 }, { 50, 70 }, { 130, 145 }, { 20, 40 } };
	}*/

	
	//2nd Way
	/*
	 * @Test(dataProvider = "DoubleSet") public void testAddition(int actual, int
	 * expected) { int actualValue = actual + 20; Assert.assertEquals(actualValue,
	 * expected); }
	 * 
	 * @DataProvider(name = "DoubleSet") public Object[][] getDataSet2() { return
	 * new Object[][] { { 100, 120 }, { 420, 450 }, { 50, 70 }, { 130, 145 }, { 20,
	 * 40 } }; }
	 */
	
	//3rd way
	 @Test(dataProvider = "testData")
	    public void testMethod(String username, String password) {
	        System.out.println("Username: " + username);
	        System.out.println("Password: " + password);
	    }

	    @DataProvider(name = "testData")
	    public Object[][] getData() {
	        return new Object[][] {
	            {"user1", "pass1"},
	            {"user2", "pass2"},
	            {"user3", "pass3"}
	        };
	    }
}
