package TestNGDataProviders;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ITParameterization {

		@Test
		@Parameters({"i","j"})
		public void add(int a, int b) {
			System.out.println("value of a and b "+ (a+b));
		}

		@Test
		@Parameters({"i","j"})
		public void substraction(int a, int b) {
			System.out.println("value of a and b "+ (a-b));
		}
		
}
