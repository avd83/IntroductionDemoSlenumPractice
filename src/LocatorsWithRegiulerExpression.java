import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsWithRegiulerExpression {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.Driver","/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form/input[1]")).sendKeys("Abhay");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9876567854");
		
		
		driver.findElement(By.className("reset-pwd-btn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		Thread.sleep(3000);
		
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Abhay");
		
	//Regular expression with cssSelector.
		driver.findElement(By.cssSelector("input[Type*='pass']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.xpath("//div[@class='checkbox-container']/span[2]")).click();
		
		Thread.sleep(3000);
	//Regular expression with xPath
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector((".logout-btn"))).click();
	}

}
