package mytests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import graphql.Assert;

public class loginPageTest {

	@DataProvider
	public Object[][] loginTestData()
	{
		//in excel, we have to maintain 2 dimension object array,as data can be anything
		//3 rows and 2 columns
		//return Object[][] so wrtten public Object[][] loginTestData
		return new Object[][] 
		{
			{"admin@gmail.com","admin123"},
			{"cust@gmail.com","cust123"},
			{"vendor@gmail.com","vendor123"},
			{"vendor@gmail.com","@#$%"},
			{"@#$%^","@#$%"},
			{null,null},
			{" "," "}
		};
	}
	@Test(dataProvider="loginTestData")
	public void loginTest(String userName,String password)
	{
		Assert.assertTrue(doLogin(userName,password));
	}
	
	
	public boolean doLogin(String userName,String password)
	{
		System.out.println("user name: " +userName);
		System.out.println("password: " +password);
		System.out.println("login successfully");
		return true;
	}
}
/* O/P
 * password: admin123
login successfully
user name: cust@gmail.com
password: cust123
login successfully
user name: vendor@gmail.com
password: vendor123
login successfully
PASSED: loginTest("admin@gmail.com", "admin123")
PASSED: loginTest("vendor@gmail.com", "vendor123")
PASSED: loginTest("cust@gmail.com", "cust123")
 */

