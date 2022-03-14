package mytests;

import org.testng.annotations.Test;

public class EcommTest {

	@Test(priority=2)
	public void loginTest()
	//1.Initially Always follow Alphabetical order, if you want to change then write the priority(inbuilt test variable)
	//2.Always write test at end for Test class and Test method
	//3.Priority can be 0 also(integer start with 0), priority can have negative values also (-1) etc
	//4.if it has same priority say (1) then it picks alphabetical order
	//5.create any test without any priority, preference will always be given to non priority based test case
	{
		System.out.println("login test");
	}
	
	@Test(priority=1)
	public void homeTest()
		{
		System.out.println("home test");
	}
	
	@Test(priority=3)
	public void carTest()
	{
	System.out.println("car test");
}
	@Test(priority=4)
	public void searchTest()
	{
	System.out.println("search test");
}
	@Test
	public void m1Test()
	{
	System.out.println("m1Test test");
}
	@Test
	public void m2Test()
	{
	System.out.println("m2Test test");
}
}
