package src.main.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	public void googleTitleTest()
	{
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
	@Test(priority=2)
	public void SearchGoogle()
	{
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Testing");
		
	}
	@Test(priority=3)
	public void googleLogotest()
	{
		driver.get("http://www.google.com");
		boolean b=driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
	}
@AfterMethod
public void tearDown()
{
	driver.quit();
}

}
