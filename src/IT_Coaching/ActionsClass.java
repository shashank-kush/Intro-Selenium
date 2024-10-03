package IT_Coaching;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\DELL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver-win64 (2)\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.switchTo().frame("iframeResult");
		WebElement field1 = driver.findElement(By.xpath("//input[@value='Hello World!']"));
		
		field1.clear();
		field1.sendKeys("Shashank");
		
		Actions act = new Actions(driver);
		
		//double click
		act.doubleClick(driver.findElement(By.xpath("//button[text()='Copy Text']"))).build().perform();
		
		/*
		 * driver.get("https://demo.opencart.com/");
		 * 
		 * WebElement Desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		 * WebElement Mac1 = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		 * 
		 * // Hover method Actions a = new Actions(driver);
		 * a.moveToElement(Desktop).build().perform();
		 * 
		 * a.moveToElement(Mac1).build().perform();
		 * 
		 * Thread.sleep(2000); Mac1.click();
		 */
		
		
		
		

		/*
		 * driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		 * 
		 * WebElement right =
		 * driver.findElement(By.xpath("//span[text()='right click me']")); WebElement
		 * copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		 * 
		 * Actions a = new Actions(driver); a.contextClick(right).build().perform();
		 * copy.click(); driver.switchTo().alert().accept();
		 * System.out.println("shahhksk");
		 */

	}

}
