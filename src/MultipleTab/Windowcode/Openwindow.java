package MultipleTab.Windowcode;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openwindow {

	public static void main(String[] args) {

		System.setProperty("WebDriver.chrome.Driver","/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("input[name='name']")).click();
		
		//to handle or open the diffrent window or tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set <String> s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		driver.get("https://rahulshettyacademy.com/");
		
		String course = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentid);
		WebElement name = driver.findElement(By.cssSelector("input[name='name']"));
		name.sendKeys(course);
		
		//to get the hight and width of the text box UI
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		driver.quit();
		}

}
