package TestNGFramwork.TestNGSevenPm;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import retry.testcases.AnnotationTransformer;
import retry.testcases.RetryLogic;

@Listeners(AnnotationTransformer.class)
public class AssertionTest {
	
	@Test
	public void test1()
	{
		String s1 = "Java";
		String s2 = "Selenium ";
		
		Assert.assertEquals(s1, s2);
		
		System.out.println("Test Case passed");
		
	}
	
	@Test
	public void test2()
	{
		String s1 = "Java";
		String s2 = "Selenium ";
		
		//Assert.assertEquals(s2, s1, "Two Values Are Equal");
		Assert.assertNotEquals(s1, s2, "Two Strings are not equal ");
		System.out.println("PASSED");
	}
	
	
	@Test
	public void test3()
	{
		String s3 = "Cucumber";
		String s4 = "TestNG";
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(s3, s4);
		
		System.out.println("Both the data are same ");
		
		s.assertAll();
			
		
	}
	
	@Test
	public void test4()
	{
		String s3 = "Cucumber";
		String s4 = "TestNG";
		
		SoftAssert s1 = new SoftAssert();
		s1.assertNotEquals(s3, s4, "They are not equal ");
		
	}

}
