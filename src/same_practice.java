import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class same_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\DELL\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver-win64 (2)\\\\\\\\\\\\\\\\chromedriver-win64//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[contains(text(),'A/B Testing')]")).click();
		System.out.println(driver.findElement(By.xpath("//div//p")).getText());
		driver.navigate().back();
		driver.findElement(By.xpath("//*[contains(text(),'Checkboxes')]")).click();
		driver.findElement(By.xpath("//form//input[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[contains(text(),'Context Menu')]")).click();         // right click - alert
		
		// for right click
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		action.contextClick(link).perform();
		
		Thread.sleep(3000);
		// alert or popup handle
		driver.switchTo().alert().accept();
		driver.navigate().back();
		Thread.sleep(3000);
		
		// drag and drop
		driver.findElement(By.xpath("//*[contains(text(),'Drag and Drop')]")).click();
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='column-b']"));
		a.dragAndDrop(source, target).build().perform();
		Thread.sleep(3000);
		
		// navigate to window - (back , forward, to, etc)
		driver.navigate().back();
		Thread.sleep(3000);
		
		// dropdown
		driver.findElement(By.xpath("//*[contains(text(),'Dropdown')]")).click();
		WebElement staticdriver = driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select dropdown = new Select(staticdriver);
		dropdown.selectByVisibleText("Option 2");
		
		Thread.sleep(3000);
		
// Important point - dropdown me kya select hua h vo print krwane ke liye aese krwana h
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.navigate().back();
		
				
		//Hover
				driver.findElement(By.xpath("//a[text()='Hovers']")).click();
				Actions b = new Actions(driver);
				WebElement hover = driver.findElement(By.xpath("//div[@class='example']//div[3]//img[@alt='User Avatar']"));
				b.moveToElement(hover).perform();
				driver.navigate().back();		
				
		// Frames
		driver.findElement(By.xpath("//a[@href='/frames']")).click();
		driver.findElement(By.xpath("//a[text()='iFrame']")).click();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		System.out.println(driver.findElement(By.xpath("//body[@id='tinymce']")).getText());
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("   nothing");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='File']")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@rows='50%,50%']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));

//Important point parentframe
		driver.switchTo().parentFrame();
//Important for main parent
		driver.switchTo().defaultContent();
		
		
		// easy login credentials
				driver.findElement(By.xpath("//*[contains(text(),'Form Authentication')]")).click();
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
				driver.findElement(By.xpath("//i[text()=' Login']")).click();
				System.out.println(driver.findElement(By.xpath("//h4")).getText());
				driver.findElement(By.xpath("//i[text()=' Logout']")).click();
				driver.navigate().to("https://the-internet.herokuapp.com/");
				
				
		Thread.sleep(6000);
		System.out.println("enter");
		
	}

}
