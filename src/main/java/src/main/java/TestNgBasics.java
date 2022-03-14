package src.main.java;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterMethod;

public class TestNgBasics {

	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("This is BeforeSuite");
	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("This is Beforetest");
	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("This is BeforeClass");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("This is Beforemethod");
	}
	@Test
	public void Test()
	{
		System.out.println("This is test");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("This is AfterMethod");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("This is AfterClass");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("This is AfterTest");
	}
}
