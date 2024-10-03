package Testng;

import org.testng.annotations.Test;

public class InvocationCount_IT {

	@Test(invocationCount=5)
	public void count() {
		System.out.println("Hello world");
	}
	@Test
	public void count1() {
		System.out.println("Hello India");
	}

	
}
