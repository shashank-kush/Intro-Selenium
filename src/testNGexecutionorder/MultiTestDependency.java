package testNGexecutionorder;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class MultiTestDependency {

	//jada use krne layak nhi h, isse acha priority use krke kam chal skta h
	//dependsOnMethods iska use krke bta do ki kis method ke bad chalana h
	
	@Test
	public void Start() {
		System.out.println("starting the server");
	}
	
	@Test(dependsOnMethods="Start")
	public void Init() {
		System.out.println("initialising the data");
	}
	
	@Test(dependsOnMethods="Init")
	public void Process() {
		Assert.assertTrue(false);
		System.out.println("Test 3 executed");
	}
	
	@Test(dependsOnMethods="Process")
	public void Stop() {
		System.out.println("Stopping the server");
	}
	
}
