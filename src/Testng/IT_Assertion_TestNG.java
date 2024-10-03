package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;


public class IT_Assertion_TestNG             {

	//This is Hard Assertion
	
	@BeforeMethod
	public void testMethod()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Downloads\\\\\\\\chromedriver-win64 (2)\\\\\\\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String expected = "Automation Testing Practice";
		String actual = driver.getTitle();
		
		//compare the title
		Assert.assertEquals(actual, expected);
		
		//check the icon is present or not
		System.out.println("check the icon is present or not");
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		
		boolean b1 = icon.isDisplayed();
		Assert.assertTrue(b1);
		
		System.out.println("shashank");
	}
	
	
}
