package Relativelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class Demo {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver","/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		WebElement username = driver.findElement(By.cssSelector("[for='username']"));
		driver.findElement(with(By.tagName("input")).below(username)).sendKeys("abc");
		
		WebElement tick = driver.findElement(By.xpath("//span[@class='text-white termsText']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(tick)).click();

		WebElement admin = driver.findElement(By.xpath("//span [text()='Admin']"));
		driver.findElement(with(By.tagName("span")).toRightOf(admin)).click();
	
		WebElement admin1 = driver.findElement(By.xpath("//span [text()='Admin']"));
		driver.findElement(with(By.tagName("input")).above(admin1)).sendKeys("rahulshettyacadmey");
		
		
		
	}

}
