import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPasswordFetchingFromString {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.Driver","/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String name = "Abhay";
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Password = getPassword(driver);		
		Thread.sleep(3000);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		
		//Regular expression with cssSelector.
			driver.findElement(By.cssSelector("input[Type*='pass']")).sendKeys(Password);
			
			driver.findElement(By.id("chkboxOne")).click();
			Thread.sleep(3000);
		//Regular expression with xPath
			driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	
	}
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'"); 
		//index[0]--Please use temporary password
		//index[1]--rahulshettyacademy' to login
		String[] passwordArray2 = passwordArray[1].split("'");
		//index[0]--rahulshettyacadamey
		//index[1]--to login
		String password = passwordArray2[0];
		return (password);
		
	}
	
	

}
