package TestNGFramwork.TestNGSevenPm;

import java.util.jar.Attributes.Name;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestCases 
{
	
	@Test
	public void testCase_TC001() {
		Assert.assertTrue(true);

	}
	
	@Test
	public void testCase_TC002()
	{
		Assert.assertFalse(true);
	}

}
