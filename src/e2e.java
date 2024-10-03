import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver-win64 (2)\\\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"))
				.click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("its disabled");
			Assert.assertTrue(true);
		} 
		else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(2);
		Thread.sleep(5000);
		//driver.findElement(By.cssSelector("input[value='Search']")).click();
		//driver.quit();
		
		
		
		
		//working latest code
		
		/*
		 * driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 * driver.manage().window().maximize(); driver.findElement(By.
		 * xpath("//input[contains(@name,'Content$rbtnl_Trip') and @value='RoundTrip']")
		 * ).click(); Thread.sleep(2000); driver.findElement(By.
		 * xpath("//input[contains(@name,'Content$rbtnl_Trip') and @value='OneWay']")).
		 * click();
		 * 
		 * driver.findElement(By.cssSelector("input[id*='originStation1_CTXT']")).click(
		 * ); driver.findElement(By.xpath("//a[contains(text(),' Bhopal')]")).click();
		 * driver.findElement(By.
		 * xpath("//div[contains(@id,'destinationStation1_CTNR')]//a[contains(text(),' Delhi')]"
		 * )).click();
		 * 
		 * driver.findElement(By.
		 * xpath("//div[@id='ui-datepicker-div']//td[contains(@class,'ui-datepicker-today') and @data-year='2024']"
		 * )).click(); driver.findElement(By.
		 * xpath("//div[contains(@id,'divpaxinfo') and @class='paxinfo']")).click();
		 * 
		 * for(int i=1; i<4; i++) {
		 * driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click(); } for(int
		 * i=1; i<2; i++) {
		 * driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click(); }
		 * driver.findElement(By.
		 * xpath("//div[contains(@id,'divpaxinfo') and @class='paxinfo']")).click();
		 * Assert.assertEquals(driver.findElement(By.
		 * xpath("//div[contains(@id,'divpaxinfo') and @class='paxinfo']")).getText(),
		 * "4 Adult, 1 Child"); System.out.println(driver.findElement(By.
		 * xpath("//div[contains(@id,'divpaxinfo') and @class='paxinfo']")).getText());
		 * 
		 * WebElement dropdown =
		 * driver.findElement(By.xpath("//select[contains(@id,'DropDownListCurrency')]")
		 * );
		 * 
		 * Select sk = new Select(dropdown); sk.selectByIndex(2);
		 * System.out.println(driver.findElement(By.xpath(
		 * "//select[contains(@id,'DropDownListCurrency')]")).getText());
		 * Thread.sleep(4000);
		 */
		
		
		
		

	}

}
