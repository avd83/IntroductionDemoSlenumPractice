import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Assertion {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.Driver","/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String name = "Abhay";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		
		//Regular expression with cssSelector.
			driver.findElement(By.cssSelector("input[Type*='pass']")).sendKeys("rahulshettyacademy");
			
			driver.findElement(By.id("chkboxOne")).click();
			
			driver.findElement(By.xpath("//div[@class='checkbox-container']/span[2]")).click();
			
			Thread.sleep(3000);
		//Regular expression with xPath
			driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
			
			Thread.sleep(3000);
			
		//	System.out.println(driver.findElement(By.tagName("p")).getText());
			
            Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
            Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");

            //xpath syntax with text attribute.
            driver.findElement(By.xpath("//button[text()='Log Out']")).click();
            Thread.sleep(2000);
	        driver.close();
	}
 
}
