package tests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class checking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chrome-win64\\chrome-win64//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		Set<String> handle= driver.getWindowHandles();
		for(String child:handle) {
			System.out.println(child);
			if(!child.equals(parentHandle)) {
				driver.switchTo().window(child);
				System.out.println(driver.findElement(By.xpath("//h1")).getText());
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parentHandle);
		driver.findElement(By.name("username")).sendKeys("Sk1234@kush.com");
		Thread.sleep(2000);
		//driver.quit();
		
		
		
//		driver.get("https://www.spicejet.com/");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//div[text()='round trip']")).click();
//		driver.findElement(By.xpath("//div[text()='one way']")).click();
//		driver.findElement(By.xpath("//div[text()='From']")).click();
//		driver.findElement(By.xpath("//div[text()='Bhopal']")).click();
//		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']//div[text()='Hyderabad']")).click();
//		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-rs99b7 r-6koalj r-eqz5dr r-1pi2tsx r-pm9dpa r-1knelpx r-13qz1uu']//div[@data-testid='undefined-month-October-2023']//div[@data-testid='undefined-calendar-day-13']")).click();
//		driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
//		
//		System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).getText());
//		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n']//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")).click();
//		for(int i=0; i<4; i++) {
//			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
//		}
//		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n']//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")).click();
//		System.out.println(driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")).getText());
//		
//		
//		  WebElement dropdown = driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[3]")); 
//		  Select s= new Select(dropdown); 
//		  s.selectByVisibleText("CAD");
//		  
		 
		
		
		
	}

}
