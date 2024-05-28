import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		List<WebElement> rowcount = driver.findElements(By.xpath("//fieldset[1]/table[@id='product']/tbody[1]/tr"));
		System.out.println("Row = "+rowcount.size());
		
		System.out.println(driver.findElement(By.xpath("//fieldset[1]/table[@id='product']/tbody[1]/tr[3]")).getText());
		
		List<WebElement> columncount = driver.findElements(By.xpath("//fieldset[1]/table[@id='product']/tbody[1]/tr/th"));
		System.out.println("Coloumn="+columncount.size());
		
		driver.quit();
	}

}
