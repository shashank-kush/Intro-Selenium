package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ParallelTesting {      //Threadcount badha do bs

	WebDriver driver;
	
	@Test
	public void loginTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Downloads\\\\\\\\chromedriver-win64 (2)\\\\\\\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		String expectedtitle = "Swag Labs";
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	
	@Test
	public void verifyLogo() {
		System.out.println("Logo matched");
	}
}
