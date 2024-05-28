

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ind");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.SHIFT,Keys.ENTER);
		
		System.out.println(driver.findElement(By.cssSelector("#autocomplete")).getAttribute("value"));
		Thread.sleep(3000);
		driver.quit();
	}

}
