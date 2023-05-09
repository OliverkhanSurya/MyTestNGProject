package TestNGFramwork.TestNGSevenPm;

import org.testng.annotations.Test;

public class PrioritizingTheTestCases {

	@Test(priority = 6 , groups = {"Smoke"})
	public void browserLaunch() {
		System.out.println("Launch the desired browser");
	}

	@Test(priority = 6, groups = {"Unit"})
	public void urlAddress() {

		System.out.println("Load the URL");
	}

	@Test(priority = 6, groups = {"Unit"})
	public void loginCredentials() {
		System.out.println("Please provide username and password");

	}

	@Test(priority = 6, groups = {"Sanity"})
	public void loginButton() {
		System.out.println("Click the login button");
	}

	@Test(priority = 6, groups = {"Regression"})
	public void verifyingTheLogin() {
		System.out.println("Verify the login button");
	}

	@Test(priority = 6, groups = {"Regression"})
	public void teardown() {
		System.out.println("Shutdown the browser");
	}

}
