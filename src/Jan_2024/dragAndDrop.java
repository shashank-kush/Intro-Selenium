package Jan_2024;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		
		
		//dragAndDrop
		WebElement src = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement trg = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(src, trg).build().perform();
		//action.clickAndHold(src).moveToElement(trg).release().build().perform();
		

	}

}
