import java.util.Iterator;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowparentchild {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.Driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@href='https://rahulshettyacademy.com/documents-request']")).click();

		Set<String> windows = driver.getWindowHandles();// (index[0]parentid,index[1]childid)

		Iterator<String> it = windows.iterator();
		String parentid = it.next();// bydefault it contains first index[0]
		String childid = it.next();// after inedx 0 select this step will take index 1

		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		
		//this is code is for fetch the password from full string directly
		String a = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split("with")[0].trim();
		
		//String  a = getPassword(driver);
		
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(a);
		
		//driver.quit();

	}
	
		public static String getPassword(WebDriver driver) {
			String passwords;
			passwords = driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
			// Please email us at mentor@rahulshettyacademy.com with below template to receive response
			
			String password = passwords.split("at")[1];
			//index[0]:Please email us
			// index[1]: mentor@rahulshettyacademy.com with below template to receive response
			String pass = password.split("with")[0];
			//index[0]: mentor@rahulshettyacademy.com
			// index[1]: below template to receive response
			return pass;
	}

	
	}


