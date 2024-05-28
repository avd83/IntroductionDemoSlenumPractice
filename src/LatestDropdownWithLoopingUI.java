import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LatestDropdownWithLoopingUI {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.Driver","/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/ ");
		driver.manage().window().maximize();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(4000);
		
	int i=1;
	while(i<4)
	{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
	}
		
		
		//for(int i=1;i<4;i++)
	   //{
		//  driver.findElement(By.id("hrefIncAdt")).click();
	   // }
	
        driver.findElement(By.id("btnclosepaxoption")).click();
        Thread.sleep(4000);
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"4 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
