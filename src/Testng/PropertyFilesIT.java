package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class PropertyFilesIT {               // ReadConfig class, and config.properties file

	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Downloads\\\\\\\\chromedriver-win64 (2)\\\\\\\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		ReadConfig config = new ReadConfig();         //Object bana liye
		driver.get(config.getURL());
	
		driver.findElement(By.id("user-name")).sendKeys(config.getUserName());
		driver.findElement(By.id("password")).sendKeys(config.getPassword());
		driver.findElement(By.id("login-button")).click();
		
	
	}
	
}
