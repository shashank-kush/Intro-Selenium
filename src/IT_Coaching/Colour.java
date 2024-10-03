package IT_Coaching;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;

public class Colour {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Downloads\\\\\\\\chromedriver-win64 (2)\\\\\\\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement e= driver.findElement(By.xpath("//input[@type='submit']"));		
		
		String backcolour = e.getCssValue("background-color");
		System.out.println(backcolour);
		
		Color.fromString(backcolour);
		String BackgroundColor = org.openqa.selenium.support.Color.fromString(backcolour).asHex();
		System.out.println(BackgroundColor);
		
		
		
	}

}
