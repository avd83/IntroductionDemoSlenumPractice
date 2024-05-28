

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
			
		 WebElement abc = driver.findElement(By.xpath("//div/div[4]/fieldset[1]/label[2]/input"));
		 abc.click();
		 System.out.println(driver.findElement(By.xpath("//div/div[4]/fieldset[1]/label[2]")).getText());
		 
		 String xyz = driver.findElement(By.xpath("//div/div[4]/fieldset[1]/label[2]")).getText();
		
		 
		 WebElement staticdropdown = driver.findElement(By.xpath("//div/div[3]/fieldset/select"));
		 Select dropdown = new Select(staticdropdown);
		 dropdown.selectByVisibleText(xyz);
		 driver.findElement(By.id("name")).sendKeys(xyz);
		 driver.findElement(By.id("alertbtn")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 
		 if (driver.switchTo().alert().getText().contains(xyz))
		 {
			 System.out.println("Alert message correct");
			 
		 }else
		 {
			 System.out.println("Alert message wrong");
			 
		 }
		 driver.switchTo().alert().accept();
		 driver.quit();
	}
		 
		 
		//driver.findElement(By.xpath("//div/div[3]/fieldset/select/option[3]")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.id("name")).sendKeys("Option2");
		//driver.findElement(By.id("alertbtn")).click();
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
	}



