package epack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Six {
	@BeforeTest
	public void BeforeTestMethod()
	{
		System.out.println("Before Test method of Six class");
	}
	@Test
	public void testSix()
	{
		System.out.println("Inside testSix method of Six class");
	}
}
