package introselenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class sellintroduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//div[text()='round trip']")).click();
		driver.findElement(By.xpath("//div[text()='one way']")).click();
		driver.findElement(By.xpath("//div[text()='From']")).click();
		driver.findElement(By.xpath("//div[text()='Hyderabad']")).click();
		Thread.sleep(2000); 
		
		/*WebElement num2 = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']"));
		num2.click();
		List<WebElement> drop2 = driver.findElements(By.cssSelector(".css-1dbjc4n.r-b5h31w.r-95jzfe"));
		int c=drop2.size();
		System.out.println();
		for(int i=0; i<=c; i++) 
		{
			if(drop2.get(i).getText().contains("Bhopal"))
			{
				drop2.get(i).click();
				break;
			}
		}*/
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']//div[text()='Jabalpur']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'][1]")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		//Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//div[@style='cursor: pointer;']")).size());
		//Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		
		//System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']")).isSelected());
		
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).getText());
		for(int i=1; i<6; i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).getText());
	
		
		WebElement num = driver.findElement(By.xpath("//div[text()='Currency']"));
		num.click();     
		List<WebElement> drop = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh']//div[@class='css-1dbjc4n r-1habvwh r-1loqt21 r-1777fci r-1mi0q7o r-1yt7n81 r-m611by r-1otgn73']"));
		int b=drop.size();
		for(int i=0; i<=b; i++) 
		{
			if(drop.get(i).getText().contains("OMR"))
			{
				drop.get(i).click();
				break;
			}
			System.out.println(drop.get(i).getText());
		}
		
		
		
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1wtj0ep r-1lgpqti']/div[@class='css-1dbjc4n']/div[@data-focusable='true']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-f9v2oj r-1a852e4 r-1609sg0 r-1pcd2l5 r-1mdbw0j r-hnxvie']//div[@class='css-76zvg2 r-homxoj r-1i10wst r-1kfrs79']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-f9v2oj r-1a852e4 r-1609sg0 r-1pcd2l5 r-1mdbw0j r-hnxvie']//div[@class='css-76zvg2 r-homxoj r-ubezar r-10yl4k']")).getText());
		driver.findElement(By.cssSelector("g[fill-rule='evenodd'] rect[width='100%']")).click();
		driver.findElement(By.className("css-76zvg2 r-1862ga2 r-1enofrn r-1kfrs79")).click();
		
	}
}
