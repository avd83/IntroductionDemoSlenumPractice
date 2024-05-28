package Javastreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Streamwithselenium {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.Driver","/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on columns
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//take WebElement list
		List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[1]"));
		//extract original list
		List <String> orignallist = elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
		//Sorted out list
		List <String> sortedlist = orignallist.stream().sorted().collect(Collectors.toList());
		//compare the original and sorted list
		
		Assert.assertTrue(orignallist.equals(sortedlist));
		
		//Required "Beans" price from the WebElement
		
		List <String> items = elementlist.stream().filter(s->s.getText().contains("Beans"))
				.map(s->getPrice(s)).collect(Collectors.toList());
		items.forEach(s->System.out.println(s));
		
		//driver.quit();	
	}

	private static String getPrice(WebElement s) {
		
		String values = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return values ;
	}

}
