import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorswithParentChildTraverse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDiver.edgedriver.Driver","/15dec22_laptop/Selenium/Setup/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//form/h2")).getText());
		Thread.sleep(5000);
				
		
		driver.findElement(By.xpath("//form/input[1]")).sendKeys("ABC");
		driver.findElement(By.cssSelector("form input[2]")).sendKeys("abc@gmail.com");		
	}

}

