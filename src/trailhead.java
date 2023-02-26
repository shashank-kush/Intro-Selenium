import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class trailhead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		/*1st assignment of rahulshetty 
		driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());
		driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());*/
		
		//2nd assignment   
		
		/*driver.findElement(By.name("name")).sendKeys("Shashank");
		driver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid")).sendKeys("rahul@rpt.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahul@123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown =new Select(staticDropdown);
		dropdown.selectByIndex(0);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("21072000");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		*/
		
		//68 no. vedio practice for allerts
		
	}

}
