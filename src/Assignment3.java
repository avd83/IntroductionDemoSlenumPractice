import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//li/a[@href='/windows']")).click();
		driver.findElement(By.xpath("//div/a[@href='/windows/new']")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();

		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.tagName("h3")).getText());

		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.quit();
	}

}
