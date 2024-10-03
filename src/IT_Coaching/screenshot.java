package IT_Coaching;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class screenshot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Downloads\\\\\\\\chromedriver-win64 (2)\\\\\\\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//create 1 folder inside introselenium like here i created Screenshot folder
		
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		// path copy karna h screenshot folder vala or paste krna h niche or last me //fullpage.png add krna h
		File targetFile = new File("C:\\Eclipse Workspaces\\selenium\\introselenium\\Screenshot//fullpage.png");
		
		sourcefile.renameTo(targetFile);*/
		
		
		
		
		//for specific part for screenshot
		/*
		 * WebElement featureproducts =
		 * driver.findElement(By.xpath("//*[@id='header-inner']")); File sourcefile =
		 * featureproducts.getScreenshotAs(OutputType.FILE);
		 * 
		 * File targetFile = new
		 * File("C:\\Eclipse Workspaces\\selenium\\introselenium\\Screenshot//featureproducts.png"
		 * ); sourcefile.renameTo(targetFile);
		 */
		
		
		
		WebElement featureproducts = driver.findElement(By.xpath("//h1[contains(text(),'Automation Testing Practice')]"));
		File sourcefile = featureproducts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File("C:\\Eclipse Workspaces\\selenium\\introselenium\\Screenshot//featureproduct.png");
		sourcefile.renameTo(targetfile);
		
		
		
	}

}
