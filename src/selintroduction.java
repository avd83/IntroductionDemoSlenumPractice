import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class selintroduction {

	public static void main(String[] args) {
	
		//invoking browser
				
		//chromedriver.exe--> Chrome browser
		//WebDriver.Chrome.driver--> value of path where exe avaliable in pc 
		
			//MSEdge Driver
		System.setProperty("webdriver.edgedriver.driver.", "/15dec22_laptop/Selenium/Setup/msedgedriver.exe");

		//EdgeDriver driver2 = new EdgeDriver();
		WebDriver driver21 = new EdgeDriver();
		driver21.get("https://cricbuzz.com");
		System.out.println(driver21.getTitle());
		System.out.println(driver21.getCurrentUrl());
		//driver21.quit();
		driver21.close();
		
		//Chormedriver

		System.setProperty("webdriver.chrome.driver", "/15dec22_laptop/Selenium/Setup/chromedriver.exe");

		//ChromeDriver driver1 = new ChromeDriver();
		WebDriver driver11 = new ChromeDriver();
		driver11.get("https://cricbuzz.com");
		System.out.println(driver11.getTitle());
		System.out.println(driver11.getCurrentUrl());
		//driver11.quit();
		driver11.close();
		
		//Firfoxdriver
		System.setProperty("webdriver.gecko.driver.", "/15dec22_laptop/Selenium/Setup/geckodriver.exe");

		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://cricbuzz.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.quit();
		driver.close();
	}

}
