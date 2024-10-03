package IT_Coaching;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Downloads\\\\\\\\chromedriver-win64 (2)\\\\\\\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.navigate().to("https://www.saucedemo.com/v1/");      // another method for opening url
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		
		driver.navigate().back();
		
		String title = driver.getTitle();
		System.out.println(driver.getTitle());  //actual title
		String S1 = "Google"; //Expected Title
		
		if(title.equals(S1)) {
			System.out.println("Title is same");
		}else {
			System.out.println("Title is not same");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		
		   

	}

}
