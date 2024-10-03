package Jan_2024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handleWebTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\DELL\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver-win64 (2)\\\\\\\\\\\\\\\\chromedriver-win64//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.rediff.com/");
		Thread.sleep(3000);

		// driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='moneyicon relative']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Indices']")).click();
		driver.findElement(By.xpath("//a[text()='Show More >>']")).click();

		// Get Count rows
		List<WebElement> totalRows = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr"));
		System.out.println("Total no. of rows are ; " + totalRows.size());

		// get count columns
		List<WebElement> totalColumns = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("Total no. of columns are ; " + totalColumns.size());

		// get the data of specific row
		List<WebElement> dataRow = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("get the data of specific row : ");
		for (WebElement rowdata : dataRow) {
			System.out.println(rowdata.getText());
		}

		// get data of column
		List<WebElement> datColumn = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr[1]/td[2]"));
		System.out.println("get the data of specific column[2] : ");
		for (WebElement rowCol : datColumn) {
			System.out.println(rowCol.getText());
		}

		// print data of complete table
		System.out.println("Complete data : ");
		for (WebElement row : totalRows) {
			System.out.println(row.getText());

		}

		driver.quit();

	}

}
