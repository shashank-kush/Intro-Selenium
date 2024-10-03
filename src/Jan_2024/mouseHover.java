package Jan_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouseHover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Hovers']")).click();
		WebElement avatar = driver.findElement(By.xpath("//div[@class='example']//div[1]//img[@alt='User Avatar']"));
		Actions action = new Actions(driver);
		action.moveToElement(avatar).build().perform();
		
		
		driver.findElement(By.xpath("(//a[text()='View profile'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("//h1[text()='Not Found']")).getText());
		//driver.quit();
	}

}
