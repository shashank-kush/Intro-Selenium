import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class frametest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\DELL\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver-win64 (2)\\\\\\\\\\\\\\\\chromedriver-win64//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());  //frame kitne h size pata krne ke liye
		//driver.switchTo().frame(0); //if kayi sare hote to index value dete, 1 hi tha isliye 0 diye h
		//driver.switchTo().frame(id, name);    //id name vala bhi 1 method h
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//driver.findElement(By.xpath("//div[@id='draggable']")).click();
		
		// drag  and drop
		
		Actions a =new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		a.dragAndDrop(source, target).build().perform();
		
		// ye frame section se normal me jane ke liye
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
	}

}
