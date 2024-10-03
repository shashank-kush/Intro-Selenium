package Testng;

import org.testng.annotations.*;

public class Basics {

		// output will be before method   Test   after method    before method   Test   after method     before method   Test   after method          
		// before test after ...........
		
		@BeforeMethod
		public void first(){
			System.out.println("ok ji");
		}
		@Test(priority=3)
		public void second(){
			System.out.println("My surname is Kushwaha");
		}
		@Test(enabled=false)
		public void third(){
			System.out.println("My city is satna");
		}
		@Test(priority=1)
		public void fourth(){
			System.out.println("My village is mahurachh");
		}
		
	// We can give 2 parameters 
		
		@Test(priority=2 , enabled =false)
		public void fifth(){
			System.out.println("My surname is Kushwaha");
		}
		@AfterMethod
		public void sixth() {
			System.out.println(" ok ");
		}
	

}
