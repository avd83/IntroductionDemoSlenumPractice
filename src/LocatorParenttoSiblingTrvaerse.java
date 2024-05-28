import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorParenttoSiblingTrvaerse {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("WebDriver.chrome.Driver","/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http//rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(4000);
		
		//Locator traverse from parent to child siblings syntax only for xpath not available for cssSelector
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[3]")).getText());
		Thread.sleep(4000);
	
	}

}
