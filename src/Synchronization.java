import java.time.Duration;
import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		addItems(driver);

		driver.findElement(By.cssSelector("a.cart-icon")).click();
		// Thread.sleep(3000);
		driver.findElement(By.xpath("//button [contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		//Explicit WebDriverWait()
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.close();
	}

	public static void addItems(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();

		int j = 0;
		String[] itemsarray = { "Brocolli", "Cucumber", "Tomato" };
		List<String> itemlist = Arrays.asList(itemsarray);

		// List <WebElement> products =
		// driver.findElements(By.xpath("//div[@class='product-action']/button"));
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		// Thread.sleep(3000);
		for (int i = 0; i < products.size(); i++) {

			// Cucumber - 1 Kg
			// index[0] - Cucumber
			// index[1] - 1 kg
			String[] splititemname = products.get(i).getText().split("-");

			String finalitemname = splititemname[0].trim();

			if (itemlist.contains(finalitemname)) {
				j++;
				// Thread.sleep(3000);
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsarray.length) {
					// Thread.sleep(3000);
					break;
				}

			}

		}
	}

}
