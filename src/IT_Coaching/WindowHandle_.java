package IT_Coaching;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle_ {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

		driver.get("https://the-internet.herokuapp.com/windows");
		
		// Get the current window handle (Parent window)
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent window -" +parentHandle);
		
		//open new window
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		

        // Get all window handles
		Set<String> handle = driver.getWindowHandles();
		for(String child : handle) {
			System.out.println("Child window - "+child);
			if(!child.equals(parentHandle)) {
				driver.switchTo().window(child);
				System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText()); 
				driver.close();
			}
		}
		driver.switchTo().window(parentHandle);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		driver.quit();
		
		

	}
}
