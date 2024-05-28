package shadowDom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public d class RelativeLocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("span[role='button']")).click();
		
		WebElement bestSeller = driver.findElement(By.xpath("//div/div[4]/div[1][@class='_38VF5e']"));//.click();//best seller
		Thread.sleep(3000);
		WebElement cart = driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(bestSeller));//cart
		Thread.sleep(3000);
		cart.click();
		Thread.sleep(3000);
		//driver.quit();
				
}

	
}

	