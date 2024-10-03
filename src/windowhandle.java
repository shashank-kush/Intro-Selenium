import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowhandle {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\DELL\\\\\\\\Downloads\\\\\\\\chromedriver-win64 (2)\\\\\\\\chromedriver-win64//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Window 1st method
		
//		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.id("name")).sendKeys("Shashank");
//		String parentHandle = driver.getWindowHandle();										// getWindowHandle means parent window only 
//		System.out.println("parent window - "+ parentHandle);
//		driver.findElement(By.className("whButtons")).click();
//		Set<String> handles = driver.getWindowHandles();									// getWindowHandles means all child windows including parent window
//		for (String child:handles) {
//			System.out.println(child);
//			if(!child.equals(parentHandle)) {
//				driver.switchTo().window(child);
//				driver.findElement(By.id("firstName")).sendKeys("HELLO");
//			Thread.sleep(5000);
//			driver.close();
//			}
//		}
//			driver.switchTo().window(parentHandle);
//			driver.findElement(By.id("name")).sendKeys("Kushwaha");
//			Thread.sleep(2000);
//			
		
		
		
		
		//Window 2nd method
		
//		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.cssSelector(".blinkingText")).click();
//		Set<String> windows = driver.getWindowHandles(); //[parentid,childid]
//		Iterator<String>it = windows.iterator();
//		String parentId =it.next();
//		String childId = it.next();
//		driver.switchTo().window(childId);
//		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
//		driver.findElement(By.cssSelector(".im-para.red")).getText();
//		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
//		driver.close();
//		driver.switchTo().window(parentId);
//
//		driver.findElement(By.id("username")).sendKeys("emailId");
//		
//		//windows my own practice
//				driver.get("https://the-internet.herokuapp.com/");
//				driver.manage().window().maximize();
//				
//				driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
//				driver.findElement(By.xpath("//a[text()='Click Here']")).click();
//				String parentHandle = driver.getWindowHandle();
//				System.out.println("Parent window - "+parentHandle);
//				Set<String> handle = driver.getWindowHandles();
//				for(String child:handle) {
//					System.out.println(child);
//					if(!child.equals(parentHandle)) {
//						driver.switchTo().window(child);
//						System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
//						Thread.sleep(3000);
//						driver.close();
//					}
//				}
//				driver.switchTo().window(parentHandle);
//				driver.navigate().back();
//				driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
//				Thread.sleep(2000);
//				driver.quit();
//				
		
		//windows assignment for practice
		
// IMPORTANT
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		
		Set<String> windows = driver.getWindowHandles(); //[parentid,childid]
		Iterator<String>it = windows.iterator();
		String parentId =it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		driver.close();
		
		//windowhandle
		/*
		 * driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		 * driver.manage().window().maximize();
		 * 
		 * String mainPageId = driver.getWindowHandle(); System.out.println(mainPageId);
		 * driver.findElement(By.className("blinkingText")).click();
		 * 
		 * Set<String> child = driver.getWindowHandles(); Iterator<String> itr =
		 * child.iterator();
		 * 
		 * String parentId = itr.next(); String childId = itr.next();
		 * 
		 * driver.switchTo().window(childId);
		 * System.out.println(driver.findElement(By.xpath("//h1")).getText());
		 * driver.close(); Thread.sleep(4000); driver.switchTo().window(parentId);
		 * Thread.sleep(4000);
		 * driver.findElement(By.id("username")).sendKeys("emailId");
		 * 
		 * System.out.println(driver.findElement(By.xpath("//input[@id='signInBtn']")).
		 * getText()); Thread.sleep(4000);
		 */
		
		
		
	}

}
