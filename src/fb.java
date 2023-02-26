import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("._2IX_2-.VJZDxU")).sendKeys("7024349936");
		driver.findElement(By.className("_2KpZ6l _2doB4z")).click();
		
		
		
	}

}
