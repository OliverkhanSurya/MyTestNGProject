package TestNGFramwork.TestNGSevenPm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	WebDriver driver;

	@Test
	@Parameters({ "BrowserName", "Data" })
	public void applicationLogin(String browser, String searchItem) {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.co.in/");

		WebElement gSearchTxtBox = driver.findElement(By.id("APjFqb"));

		gSearchTxtBox.sendKeys(searchItem, Keys.ENTER);

	}

}
