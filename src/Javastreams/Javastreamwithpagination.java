package Javastreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javastreamwithpagination {

	public static void main(String[] args) {

		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// In Web page , how to find and move to next page for the items.
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<String> price;
		do {

			List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[1]"));

			price = elementlist.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPrice(s))
					.collect(Collectors.toList());
			price.forEach(s -> System.out.println(s));

			if (price.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while (price.size() < 1);
	}

	private static String getPrice(WebElement s) {

		String values = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return values;
	}
}
