package mytests;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	//when you are giving demo if u expecting the excption then use it, if exception expected then use
	//try catch block
	
	@Test(expectedExceptions= {ArithmeticException.class,NullPointerException.class})
	public void searchTest()
	{
		System.out.println("search Test");
		int i=9/0;
		//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
	}
	@Test(expectedExceptions= {ArithmeticException.class})
	public void loginTest()
	{
		System.out.println("search Test");
		int i=9/0;
		//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
	}
	@Test(expectedExceptions= {Exception.class})
	public void homeTest()
	{
		System.out.println("search Test");
		int i=9/0;
		//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
	}
	
}
