import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver-win64 (2)\\\\chromedriver-win64//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/gp/cart/view.html/ref=sw_rv_inscr?app-nav-type=none&dc=dfś");
		driver.manage().window().maximize();
		
		//hover
		Actions a= new Actions(driver);
		WebElement move= driver.findElement(By.cssSelector("#nav-link-accountList"));
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//move to specific element
		a.moveToElement(move).contextClick().build().perform();
		
		
		/*original code h ye 
		 * driver.findElement(By.cssSelector("#nav-link-accountList")).click();
		driver.findElement(By.cssSelector("#ap_email")).sendKeys("7024349936");
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.cssSelector("#ap_password")).sendKeys("Shashank@123");
		driver.findElement(By.id("signInSubmit")).click();
		System.out.println(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")).getText());
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_5']")).click();
		Thread.sleep(2000);*/
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("//div[@id='s-refinements']//i[@class='a-icon a-icon-checkbox']")).click();

	}
		/////span[text()='Health Brands']/ancestor::div[@class='a-section a-spacing-small']/following-sibling::ul/li/span/a/div/label/input/following-sibling::i
}//div[@id='s-refinements']//i[@class='a-icon a-icon-checkbox']

	//span[text()='Health Brands']/ancestor::div[@class='a-section a-spacing-small']/following-sibling::ul/li/span/a[@href='bbn=1350384031&rh=n%3A1350384031%2Cp_n_feature_thirteen_browse-bin%3A27915243031&dc&qid=1674593224&rnid=27915241031&ref=lp_1350385031_nr_p_n_feature_thirteen_browse-bin_0']/div/label/input/following-sibling::i[1]
	//span[text()='Health Brands']/ancestor::div[@class='a-section a-spacing-small']/following-sibling::ul/li/span/a[@href='bbn=1350384031&rh=n%3A1350384031%2Cp_n_feature_thirteen_browse-bin%3A27915243031&dc&qid=1674593224&rnid=27915241031&ref=lp_1350385031_nr_p_n_feature_thirteen_browse-bin_0']/div/label/input/following-sibling::i[1]