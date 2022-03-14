package mytests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
//1.Globalpost condition
	//user is available or not,admin
//2.Pre conditions
//3.test steps + assertions(act vs exp result)
//4.Post steps(logout, close the browser)
	
	
	/**
	 * 
	 * 
	 * 
BS ---create user (only once execution)
BT ---connect with DB (only once execution)
BC ---launch (only once execution)

BM ---Login toApp
Test--homePageTest //(Test cases will be picked in Alphabetical order)
AM----logout

BM ---Login toApp
Test ---priceTest  //(Test cases will be picked in Alphabetical order)
AM-----logout

BM ---Login toApp
Test ---searchPageTest   //(Test cases will be picked in Alphabetical order)
AM-----logout

AC---closeBrowser  (only once execution)
AT---disconnectWithDB (only once execution)
AS---deleteUser	 (only once execution)  
 */
	
	@BeforeSuite
	public void createUser()
	{
		System.out.println("BS  --- create user");
	}
	
	@BeforeTest
	public void connectWithDB()
	{
		System.out.println("BT ---connect with DB");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("BC ---launch");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("BM ---Login toApp");
	}
	@Test
	public void homePageTest()
	{
		System.out.println("Test ---homePageTest");
	}
	@Test
	public void searchPageTest()
	{
		System.out.println("Test ---searchPageTest");
	}
	@Test
	public void priceTest()
	{
		System.out.println("Test ---priceTest");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("AM--logout");	
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("AC--closeBrowser");	
	}
	@AfterTest
	public void disconnectWithDB()
	{
		System.out.println("AT--disconnectWithDB");	
	}
	@AfterSuite
	public void deleteUser()
	{
		System.out.println("AS--deleteUser");	
	}
}
