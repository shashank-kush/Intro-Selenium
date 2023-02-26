import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class irctc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (11)//chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only+Goibibo&utm_term=%21SEM%21DF%21G%21Brand%21RSA%21108599293%216504095653%21602838584772%21e%21goibibo%21c%21&gclid=Cj0KCQiAofieBhDXARIsAHTTldoSTqfr1IYya5ysU-dbkPrkMLHQPNLTKaUBEAbDBrLMrpM85AOejjAaAkTCEALw_wcB");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='sc-ikJyIC cLTzBM']/ul/li[2]/span[1]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='sc-ikJyIC cLTzBM']/ul/li[2]/span[2]")).getText());
		driver.findElement(By.xpath("//div[@class='sc-ikJyIC cLTzBM']/ul/li[1]/span[1]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='sc-ikJyIC cLTzBM']/ul/li[1]/span[2]")).getText());
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("bhopal");
		driver.findElement(By.xpath("//ul/li/div/div/div/p/span[text()='Bhopal, India']")).click();
		
		driver.findElement(By.xpath("//div/div[5]/div/p[1]")).click();
		for(int i=0; i<5; i++) {
			
		}
		
		
		//div/div[1]/div[1]/div/span[2]]/svg/path
		
		
	}

}
