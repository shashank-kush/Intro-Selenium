package Practice;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class prcatice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().window().maximize();
		
		//verify radibox selected
		WebElement elementSelected = driver.findElement(By.xpath("//td/label[text()='One Way']"));
		Assert.assertTrue(elementSelected.isSelected());
		System.out.println(elementSelected.isSelected());
		
		//verify page title
		String pageLayout = driver.getTitle();
		Assert.assertEquals(pageLayout, "QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("GOA");
		System.out.println(driver.findElement(By.xpath("//a[@class='blinkingText']")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Delhi (DEL)']")).click();
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']//a[text()='8']")).click();
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		Thread.sleep(2000);
		for (int i =1 ; i<5;i++) {
			driver.findElement(By.id("hrefIncChd")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		
		WebElement dropdownStatic = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select (dropdownStatic);
		dropdown.selectByIndex(2);
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		

		
		
		
		//driver.close();
		/*
		 * List <webElement>selection =
		 * driver.findElements(By.className("select_CTXT")); selection.get(0);
		 */
	}
}
