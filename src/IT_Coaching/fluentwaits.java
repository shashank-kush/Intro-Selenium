package IT_Coaching;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;

public class fluentwaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\DELL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver-win64 (2)\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver-win64//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		Wait<WebDriver> waits = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(10))  // Maximum wait time
		        .pollingEvery(Duration.ofSeconds(2))  // Check every 2 seconds
		        .ignoring(NoSuchElementException.class);  // Ignore NoSuchElementException during polling

		WebElement tstUserName = waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Type to Select Countries']")));

		tstUserName.sendKeys("abcdefghijklmnop");
		
		/*
		 * Wait<WebDriver> waits = new FluentWait<WebDriver>(driver)
		 * .withTimeout(Duration.ofSeconds(10)) // Total timeout for waiting
		 * .pollingEvery(Duration.ofSeconds(2)) // Poll every 2 seconds
		 * .ignoring(NoSuchElementException.class);
		 * 
		 * WebElement tstUserName = waits.until(new Function<WebDriver, WebElement>() {
		 * public WebElement apply(WebDriver driver) { WebElement element =
		 * driver.findElement(By.
		 * xpath("//input[@placeholder='Type to Select Countries']")); if
		 * (element.isDisplayed()) { // Check if element is displayed return element; }
		 * else { return null; // Return null if not found, FluentWait will keep trying
		 * } } }); tstUserName.sendKeys("abcdefghijklmnop");
		 */
	}

}
