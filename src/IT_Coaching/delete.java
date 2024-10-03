package IT_Coaching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class delete {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Downloads\\\\\\\\chromedriver-win64 (2)\\\\\\\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		
		WebElement FirstName = driver.findElement(By.xpath("//div[@class='placeholder']//following-sibling::input[@type='text' and @name='firstname']"));
			
		driver.get(driver.getCurrentUrl());
		
		FirstName = driver.findElement(By.xpath("//div[@class='placeholder']//following-sibling::input[@type='text' and @name='firstname']"));
		FirstName.sendKeys("Shashank");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kushwaha");
		
		driver.findElement(By.xpath("//span[@data-name='gender_wrapper']//span[1]/label//following-sibling::input")).click();
		WebElement birthDate = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select date = new Select(birthDate);
		date.selectByValue("20");
		System.out.println(birthDate);
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		//Xpath with text()
		
        //driver.findElement(By.xpath("//label[text()='Female']")).click();
	    
		//xpath with contains()
		
       // driver.findElement(By.xpath("//input[contains(@id,'u_

	}

}
