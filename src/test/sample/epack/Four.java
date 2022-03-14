package epack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Four {
	@BeforeTest
	public void BeforeTestMethod()
	{
		System.out.println("Before Test method of Four class");
	}
	@Test(groups={"smoke"})
	public void testOne()
	{
		System.out.println("Inside testFour method of Four class");
	}
}
