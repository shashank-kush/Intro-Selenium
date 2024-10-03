package Jan_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class UploadFileinSelenium {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\DELL\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver-win64 (2)\\\\\\\\\\\\\\\\chromedriver-win64//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();

		WebElement upload = driver.findElement(By.id("file-upload"));
		String path = "D:\\Memories\\extra\\IMG20190514144522.jpg";
		// path - D:\\Memories\\extra name of that image - IMG20190514144522
		upload.sendKeys(path);

		Thread.sleep(3000);

		driver.findElement(By.id("file-submit")).click();
		String confirmationTxt = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
		Assert.assertEquals(confirmationTxt, "File Uploaded!");
		
		//Assert.assertEquals(confirmationTxt, "File Uploaded!");

		Thread.sleep(3000);
		//driver.quit();

	}

}
