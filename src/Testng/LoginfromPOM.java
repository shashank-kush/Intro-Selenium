package Testng;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginfromPOM {           // from POM class

	static WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Downloads\\\\\\\\chromedriver-win64 (2)\\\\\\\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
	}
	
	@Test
	//actual test method
	public void loginTest() {
		POM run = new POM(driver);
		run.setUserName("standard_user");
		run.setPassword("secret_sauce");
		run.click();
		
		System.out.println(driver.getTitle());
		String expected = "Swag Labs 2";
		String actual = driver.getTitle();
		
		Assert.assertEquals(actual, expected);
		System.out.println("shashank");
		
	}
}
