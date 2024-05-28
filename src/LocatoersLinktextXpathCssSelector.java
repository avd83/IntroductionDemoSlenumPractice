import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatoersLinktextXpathCssSelector {

	public static void main(String[] args)  {

		System.setProperty("WebDiver.edgedriver.Driver","/15dec22_laptop/Selenium/Setup/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		//below code for sync the steps using blow duration time.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//linktext Syntax : compar ethe string.
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		
		//xPath 1 Syntax : Tagname[@attribute='Value']
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Abhay");
		
		//cssSelector 2 Syntax : Tagname[attribute='Value']
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abhaydere22gmail.com");
			
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		
		//xPath 2 syntax : //Tagname[@attribut'Value'][index of the field]
		driver.findElement(By.xpath("//input[@Type='text'][2]")).sendKeys("abc@gmail.com");
				
		//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9978657098");
		
		//below syntax for xPath with parent child traverse technique: //Parent/Child[index]
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9755513227");
		
		//cssSelector 3 type syntax : Tagname.classname or .classname
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		//CssSelector 4 type syntax: Parentname Childname
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		

	}

}
