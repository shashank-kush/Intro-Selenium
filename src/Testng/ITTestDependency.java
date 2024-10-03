package Testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class ITTestDependency {

		@Test(dependsOnMethods = {"Test2"})
		//@Test(dependsOnMethods = {"test2","test3"})
		public void Test1() {
			System.out.println("test method 1");
		}
		
		@Test
		public void Test2() {
			System.out.println("test method 2");
			Assert.assertTrue(false);
		}
		
		@Test(description = "This is my main method")
		public void Test3() {
			System.out.println("test method 3");
		}
	}