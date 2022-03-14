package dpack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Two {

	@BeforeTest
	public void BeforeTestMethod()
	{
		System.out.println("Before Test method of Two class");
	}
	@Test
	public void testTwo()
	{
		System.out.println("Inside TestTwo method of Two class");
	}
}
