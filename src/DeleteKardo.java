import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DeleteKardo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Downloads\\\\\\\\chromedriver-win64 (2)\\\\\\\\chromedriver-win64//chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement upload = driver.findElement(By.xpath("//input[@id='file-upload']"));
		String path= "D:\\\\Memories\\\\extra\\\\IMG20190514144522.jpg";
		
		upload.sendKeys(path);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		


	}
}
