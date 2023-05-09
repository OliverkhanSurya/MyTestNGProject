package TestNGFramwork.TestNGSevenPm;

import org.testng.annotations.Test;

public class DayOne {

	@Test(invocationCount = 10)
	public void demoMethod() {
		System.out.println("Hi, This is sample TestNG program !!");
	}

	@Test
	public void method2() {
		System.out.println("Sample Method 2");
	}

	@Test
	public void method3() {
		System.out.println("Sample method 3");
		
		
	}
}
