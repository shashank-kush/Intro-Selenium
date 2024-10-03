package IT_Coaching;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\DELL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver-win64 (2)\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver-win64//chromedriver.exe");
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//Method 1
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("09/05/2024");

		//method 2
		
		//Expected dates
		String year ="2023";
		String month = "May";
		String Day = "20";
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//select month and year
		while(true) {
			//xpath are same for every Month/Year
			//getText value return krke dega
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			// for forward move
			//driver.findElement(By.xpath("//span[text()='Next']")).click();
			//for backward move
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
		}
		
		//select for date
		List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
		
		for(WebElement date:allDates) {
			if(date.getText().equals(Day)) {
				date.click();
			}
		}
		
		System.out.println("shashank");
		
	}

}
