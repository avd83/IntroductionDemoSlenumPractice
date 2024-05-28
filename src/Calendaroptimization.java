import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendaroptimization {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='dayContainer'] span")));
		
		driver.findElement(By.cssSelector("div[class='dayContainer'] span")).click();
		driver.findElement(By.xpath("//input[@placeholder='Date of travel']")).click();
		
		driver.findElement(By.xpath("//span[8]")).click();
		
	}

}
