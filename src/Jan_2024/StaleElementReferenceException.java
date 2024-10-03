package Jan_2024;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaleElementReferenceException {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\DELL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver-win64 (2)\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		
		WebElement checkbox = driver.findElement(By.xpath("//input[contains(@type,'checkbox')][1]"));
		driver.get(driver.getCurrentUrl());                           // StaleElementReferenceException is line ki vajah se aata h kyuki page refresh hota h, ya fr redirect kar jae yadi new page me tab
		
		try{
			checkbox.click();
		}catch(Exception e) {
			checkbox = driver.findElement(By.xpath("//input[contains(@type,'checkbox')][1]"));      // handle karne ke liye vaps se same element bana lo
		}
		checkbox.click();
		System.out.println("shashank");
	}

}
