package IT_Coaching;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		// Get the current window handle (Parent window)
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window - "+parentWindow);
		
		Thread.sleep(2000);
		  // Open new windows
		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();
		
		// Get all window handles and convert them to a List
		Set<String> Handles = driver.getWindowHandles();
		List<String> ListHandles = new ArrayList<>(Handles);
		
		 // Switch to the first new window (index 1)
		driver.switchTo().window(ListHandles.get(1));                // 0 index parent hi hoga
		System.out.println("Switched to Window Handle 1 - "+ListHandles.get(1));
		Thread.sleep(5000);
		
		  // Perform actions in the first new window
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		// Switch to the second new window (index 2)
		driver.switchTo().window(ListHandles.get(2));
		System.out.println("Switched to Window Handle 2- "+ListHandles.get(2));
		
		// Perform actions in the second new window
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Knowledge')]")).getText());
		
		driver.switchTo().window(parentWindow);
		System.out.println("Switched back to Parent Window Handle: - "+parentWindow);
		driver.quit();
		
		
		
		
		

	}

}
