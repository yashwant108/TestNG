package AppTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {

	// 
	@Test (priority=1)
	public void opencartTitleTest() {
				Assert.assertEquals(driver.getTitle(), "Account Login");
	}

	@Test (priority=2)
	public void opencartSearch() {
		Assert.assertTrue(driver.findElement(By.cssSelector("div#logo a")).isDisplayed());

	}

}
