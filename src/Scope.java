import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Scope {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\DELL\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver-win64 (2)\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver-win64//chromedriver.exe");
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='right-align']/fieldset/label[2]/input")).click();
		String opt = driver.findElement(By.xpath("//div[@class='right-align']/fieldset/label[2]")).getText();
		//isne Option2 ko bs save krke rakha h kyuki gettext h ab usko kahi bhi use krte rho
		System.out.println(opt);
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(opt);
		
		driver.findElement(By.cssSelector("#name")).sendKeys(opt);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//div[@class='left-align']/fieldset/label[3]/input")).click();
		String opt1 = driver.findElement(By.xpath("//div[@class='left-align']/fieldset/label[3]")).getText();
		System.out.println(opt1);
		
		
		/* niche ka code rahul shetty course me btaya h, original h
		//1. give me the count of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//2. count of footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//3. 
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		//4- click on each link in the coloumn and check if the pages are opening-S
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
		}// opens all the tabs
		Set<String> abc=driver.getWindowHandles();//4
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		}*/
		
		
		
	}

}
