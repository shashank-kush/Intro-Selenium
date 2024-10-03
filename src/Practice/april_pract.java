package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class april_pract {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver-win64 (2)\\\\chromedriver-win64//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Practice Page']")).getText());
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India");
		
		WebElement dropdownEx = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select option = new Select(dropdownEx);
		option.selectByIndex(2);
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		

		
		
	}

}
