import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsIdNameClass {

	public static void main(String[] args) {
	
		System.setProperty("WebDiver.edgedriver.Driver","/15dec22_laptop/Selenium/Setup/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//implicit wait is nothing but time out(Seconds) for synchronization between the steps execution.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Abhay");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
	}

}
