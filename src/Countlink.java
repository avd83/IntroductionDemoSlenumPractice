import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countlink {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1. count the link in whole web page		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. count the bottom side web link on same web page
		WebElement footerlink = driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println(footerlink.findElements(By.tagName("a")).size());
		
		//3. count the bottom first column links 
		
		WebElement firstcolumnlink = driver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
		System.out.println(firstcolumnlink.findElements(By.tagName("a")).size());
		
		//4. open the each link bottom first column and get the title
		
		for(int i=1;i<firstcolumnlink.findElements(By.tagName("a")).size();i++)
		{
			String xyz = Keys.chord(Keys.CONTROL,Keys.SHIFT,Keys.ENTER);
			firstcolumnlink.findElements(By.tagName("a")).get(i).sendKeys(xyz);
		
		}
		Set <String> title = driver.getWindowHandles();
		Iterator <String> it = title.iterator();
		while (it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
		
		}
		
		
	}

