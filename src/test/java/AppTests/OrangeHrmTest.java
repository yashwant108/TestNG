package AppTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmTest extends BaseTest {



@Test(priority=2)
public void logoTest()
{
	//Asserts that a condition is true. If it isn't it throws an AssertionError without a message.
	Assert.assertTrue(driver.findElement(By.className("nav-logo")).isDisplayed());
}
@Test(priority=3)
public void contactSalesLinkTest()
{
		Assert.assertTrue(driver.findElement(By.linkText("CONTACT SALES")).isDisplayed());
}

@Test(priority=1)
public void pageTitleTest()
{
		String title=driver.getTitle();
		System.out.println("Page title:" +title);
		//Asserts that two objects are equal. 
		//If they are not, an AssertionError without a message is thrown. If expected and actual are null,they are considered equal.
		Assert.assertEquals(title, "Sign Up for a Free HR Software Trial | OrangeHRM");
}

@Test(priority=4)
public void headerTest()
{
	String header=driver.findElement(By.cssSelector("div.try-it-text h1")).getText();
	Assert.assertTrue(header.contains("Your free trial"));
}

}
