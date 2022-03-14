package epack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Five {
	@BeforeTest
	public void BeforeTestMethod()
	{
		System.out.println("Before Test method of Five class");
	}
	@Test(groups={"smoke"})
	public void testFive()
	{
		System.out.println("Inside testFive method of Five class");
	}
}
