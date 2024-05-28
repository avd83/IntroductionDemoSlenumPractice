import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.Driver","/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(3000);
			
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
	}

}
