package IT_Coaching;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScript1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Downloads\\\\\\\\chromedriver-win64 (2)\\\\\\\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//SendKeys                // method - executeScript
		js.executeScript("arguments[0].setAttribute('value','Shashank')", inputbox);
		
		//click operation
		WebElement sex = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", sex);
		
		//To find the domain of the webpage
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println(domain);
		
		// To find the URL
		String url= js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		// To find the Title
		String Title= js.executeScript("return document.title;").toString();
		System.out.println(Title);
		
		// navigate to different web page
		js.executeScript("window.location='https://www.google.com/'");
		
		//To display alert
		//js.executeScript("alert('Alert message.');");
		
	}

}
