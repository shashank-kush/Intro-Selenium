package IT_Coaching;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaticTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Downloads\\\\\\\\chromedriver-win64 (2)\\\\\\\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//no.of rows
		List<WebElement> totalrows= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println(totalrows.size());
		
		//no. of rows
		List<WebElement> totalcolumn = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
		System.out.println(totalcolumn.size());
		
		//read the element 
		/*
		 * List<WebElement> book =
		 * driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[4]/td[2]"))
		 * ;) System.out.println(book.size());
		 */
		
		// print data of complete table
				System.out.println("Complete data : ");
				for (WebElement row : totalrows) {
					System.out.println(row.getText());
				}

		}

}
