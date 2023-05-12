package TestNGFramwork.TestNGSevenPm;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class MultipleInputs {
	WebDriver driver;
	ExtentReports er;

	@Test(dataProvider = "MobilePhones")
	public void googlePage(String a) throws IOException {
		
		er = new ExtentReports();
		ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("ExtentReport.html");
		er.attachReporter(htmlReport);
		ExtentTest testCase = er.createTest("GooglePage multiple inputs");
		
	

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.co.in/");

		WebElement gSearchTxtBox = driver.findElement(By.id("APjFqb"));

		gSearchTxtBox.sendKeys(a, Keys.ENTER);
		
		Date d = new Date();
		String data = d.toString();
		String upd1 = data.replaceAll(" ", "_");
		String dateAndTime = upd1.replaceAll(":", "_");

		System.out.println(dateAndTime);

		TakesScreenshot tks = (TakesScreenshot) driver;
		File tempFile = tks.getScreenshotAs(OutputType.FILE);

		File permFile = new File(
				"Proofs/ScreenShot" + dateAndTime + ".png");
		FileUtils.copyFile(tempFile, permFile);
		
		testCase.addScreenCaptureFromPath("Proofs/ScreenShot" + dateAndTime + ".png");
		
		
		er.flush();

	}

	@DataProvider(name = "MobilePhones")
	public String[] datas() {
		return new String[] { "Iphone", "Samsung", "Nokia", "HTC", "OPPO", "RealMe", "THINQ", "Micromax", "Lenovo", "HTC", "GooglePixel" };

	}
	
	@AfterSuite
	public void shutDown()
	{
		driver.quit();
		er.flush();
	}

}
