package dpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(ListenerDemo.class)
public class One {

	
WebDriver driver;

@Parameters({"URL"})
@Test(dataProvider="getData")
public void setup(String username,String password)
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://omayo.blogspot.com/");
	Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	
//	driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/input[1]")).sendKeys(username);
//	driver.findElement(By.xpath("//*[@id=\"HTML31\"]/div[1]/form/input[2]")).sendKeys(password);
	//driver.close();
}

//	@Test
//public void loginTest()
//{
//	//System.out.println("username:"+username+ " Password:"+password);
//
////	
//}

@DataProvider
public Object[][] getData()
{
	//Object[][] data=new Object[2][2];
//	data[0][0]="yash";
//	data[0][1]="123";
//	
//	data[1][0]="reddy";
//	data[1][1]="123";
	Object[][] data= {{"yash","123"},{"reddy","456"}};
	return data;
}

}