package TestNGFramwork.TestNGSevenPm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	
	@AfterMethod
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		

	}
	
	@BeforeMethod
	public void tearDown()
	{
		driver.quit();
	}

}
