package dpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Three {
	WebDriver driver;
	@Test
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		String title=driver.getTitle();
		Assert.assertFalse(title.equals("omayo1 (QAFox.com)"));
		driver.close();
//		driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/input[1]")).sendKeys(username);
//		driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/input[2]")).sendKeys(password);
		//driver.close();
	}
}
