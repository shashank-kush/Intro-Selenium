package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Delete {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
			String m=driver.getWindowHandle();
			driver.findElement(By.linkText("Open a popup window")).click();
			driver.findElement(By.linkText("Blogger")).click();
			ArrayList<String>mp=new ArrayList<String>(	driver.getWindowHandles());
			
					driver.switchTo().window(mp.get(0));
					System.out.println(driver.getTitle());
					
					Thread.sleep(3000);
					driver.switchTo().window(mp.get(1));
					System.out.println(driver.getTitle());
					Thread.sleep(2000);
					String ma=driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
					System.out.println(ma);
			
					driver.switchTo().window(mp.get(3));
					System.out.println(driver.getTitle());
					Thread.sleep(3000);
					driver.findElement(By.xpath("//span[text()='Sign in']")).click();
				
			
					driver.switchTo().window(mp.get(0));
		driver.findElement(By.name("q")).sendKeys("Tarun");
		
			
			
	
		
		
		
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64//chromedriver.exe"
		 * );
		 * 
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--remote-allow-origins=*");
		 * 
		 * WebDriver driver = new ChromeDriver(options);
		 * driver.get("https://www.facebook.com/");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * 
		 * // verify page title String pageLayout = driver.getTitle();
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.findElement(By.xpath("//input[@name='email']")).
		 * getAttribute("placeholder")); System.out.println(driver .findElement( By.
		 * xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"
		 * )) .getText());
		 * 
		 * 
		 * // List ke liye java util import karna
		 * 
		 * List<WebElement> links = driver.findElements(By.tagName("a"));
		 * System.out.println(links.size());
		 * 
		 * for(WebElement link : links) { System.out.println(link.getText()); }
		 * 
		 * 
		 * WebElement elementDisplayed = driver.findElement( By.
		 * xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"
		 * )); System.out.println(elementDisplayed.isDisplayed());
		 * Assert.assertTrue(elementDisplayed.isDisplayed());
		 * 
		 * WebElement elementEnabled =
		 * driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		 * Assert.assertTrue(elementEnabled.isEnabled());
		 * System.out.println(elementDisplayed.isEnabled());
		 */

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64//chromedriver.exe"
		 * );
		 * 
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--remote-allow-origins=*");
		 * 
		 * WebDriver driver = new ChromeDriver(options);
		 * driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * // verify radiobox selected
		 * 
		 * WebElement onetripSelected =
		 * driver.findElement(By.xpath("//td/input[@value='OneWay']"));
		 * Assert.assertTrue(onetripSelected.isSelected());
		 * System.out.println(onetripSelected.isSelected());
		 * 
		 * 
		 * WebElement elementSelected =
		 * driver.findElement(By.xpath("//td/input[@value='RoundTrip']"));
		 * Assert.assertFalse(elementSelected.isSelected());
		 * System.out.println(elementSelected.isSelected()); elementSelected.click();
		 * Assert.assertTrue(elementSelected.isSelected());
		 * System.out.println(elementSelected.isSelected());
		 */

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64//chromedriver.exe"
		 * );
		 * 
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--remote-allow-origins=*");
		 * 
		 * WebDriver driver = new ChromeDriver(options);
		 */
		/*
		 * driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select"
		 * );
		 * 
		 * //driver.manage().window().maximize();
		 * driver.switchTo().frame(driver.findElement(By.
		 * xpath("//iframe[@id='iframeResult' and @name='iframeResult']"))); WebElement
		 * dropdown =
		 * driver.findElement(By.xpath("//select[@name='cars' and @id='cars']"));
		 * 
		 * Select sk = new Select (dropdown);
		 * 
		 * 
		 * sk.selectByIndex(1);
		 * System.out.println(sk.getFirstSelectedOption().getText());
		 * 
		 * sk.selectByValue("opel");
		 * 
		 * sk.selectByVisibleText("Audi");
		 * 
		 * 
		 * List<WebElement> cars = sk.getOptions(); for(WebElement car : cars) {
		 * System.out.println(car.getText()); }
		 */
		/*
		 * driver.get(
		 * "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		 * driver.switchTo().frame(driver.findElement(By.
		 * xpath("//iframe[@id='iframeResult' and @name='iframeResult']"))); WebElement
		 * multiDropdown =
		 * driver.findElement(By.xpath("//select[@name='cars' and @id='cars']")); Select
		 * multi = new Select(multiDropdown);
		 * 
		 * multi.selectByIndex(1); multi.selectByIndex(2);
		 * 
		 * System.out.println(multi.getFirstSelectedOption().getText());
		 * System.out.println("***************"); List<WebElement> Cars =
		 * multi.getAllSelectedOptions(); for(WebElement car : Cars) {
		 * System.out.println(car.getText()); } multi.deselectAll();
		 */
	}

}
