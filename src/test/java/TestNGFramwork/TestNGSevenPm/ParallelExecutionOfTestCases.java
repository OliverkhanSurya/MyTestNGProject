package TestNGFramwork.TestNGSevenPm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelExecutionOfTestCases {
	WebDriver driver;

	@Test
	public void validUsernameAndValidPassword() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		WebElement emailTxtBox = driver.findElement(By.id("email"));

		WebElement passwordTxtBox = driver.findElement(By.id("pass"));

		WebElement loginBtn = driver.findElement(By.name("login"));
		emailTxtBox.sendKeys("Admin123");
		passwordTxtBox.sendKeys("Admin123");
		loginBtn.click();

	}

	@Test
	public void invalidUsernameAndValidPassword() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		WebElement emailTxtBox = driver.findElement(By.id("email"));
		WebElement passwordTxtBox = driver.findElement(By.id("pass"));

		WebElement loginBtn = driver.findElement(By.name("login"));
		emailTxtBox.sendKeys("");
		passwordTxtBox.sendKeys("Google");
		loginBtn.click();

	}

	@Test
	public void validUsernameAndInValidPassword() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		WebElement emailTxtBox = driver.findElement(By.id("email"));
		WebElement passwordTxtBox = driver.findElement(By.id("pass"));

		WebElement loginBtn = driver.findElement(By.name("login"));
		emailTxtBox.sendKeys("Admin123");
		passwordTxtBox.sendKeys("");
		loginBtn.click();

	}
}
