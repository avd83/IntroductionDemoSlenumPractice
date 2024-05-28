import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ChekboxSizeAndAssetionOfCheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.Driver","/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/ ");
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	
		//To check the assertion value of checkbox getting true or false,ticked or unticked
	Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Thread.sleep(3000);
	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		//To check the assertion value of checkbooks getting true or false,ticked or unticked
	Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		
//Count the number of text box in the page using Size()method using cssSelector
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),6);
		driver.close();
	}

}
