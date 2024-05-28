import java.time.Duration;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Endtoendscenarioforsynchronization {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");

		driver.findElement(By.xpath("//input[@value='user'][1]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value='user'][1]")).isSelected());
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath(
				"//p[contains(text(),'You will be limited to only fewer functionalities of the app. Proceed?')]"))
				.getText());

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();

		driver.findElement(By.xpath("//select/option[@value='consult']")).click();
		driver.findElement(By.cssSelector("#terms")).click();

		driver.findElement(By.cssSelector(("#signInBtn"))).click();

		addPhones(driver);

		driver.findElement(By.partialLinkText("Checkout")).click();
	}

	public static void addPhones(WebDriver driver) {
		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for (int i = 0; i < products.size(); i++)

		{

			products.get(i).click();

		}
	}
}
