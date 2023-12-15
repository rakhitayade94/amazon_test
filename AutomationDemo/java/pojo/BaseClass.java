package pojo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass   {
	
	public static WebDriver driver;
	public static String browserName="Chrome";
	/*
	 * public static WebDriver openbrowserName(String url) {
	 * 
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.get(url); driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000)); return
	 * driver; }
	 * 
	 */
	@BeforeMethod
	public static void openbrowserName() {
		
		if(driver==null)
		{
			
		if (browserName == "Edge") {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName == "Chrome") {
			WebDriverManager.chromedriver().setup();

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		} else {
			System.out.println("Sorry! browserName not Available in system");
		}
		}
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			//driver.quit();
		}

	}
}
