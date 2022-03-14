import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotations_Sample {

	@BeforeTest
	public void setup()
	{
		System.out.println("Launching browser and executing the test flow");
	}
	
	@AfterTest
	public void closure()
	{
		System.out.println("Closing the test case");
	}
	@Test(priority=1)
	public void login()
	{
		System.out.println("Excuting login test");
	}
	@Test(priority=3)
	public void register()
	{
		System.out.println("Register login test");
	}
	@Test(priority=2)
	public void HomePage()
	{
		System.out.println("Home page test");
	}
	
	
}
