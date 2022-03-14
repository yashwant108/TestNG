package mytests;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

		
		@Test
		public void loginTest()
		{
			System.out.println("Login Test");
			int i=9/0;
		}
		@Test(dependsOnMethods="loginTest")
		public void homeTest()
		{
			System.out.println("search Test");	
		}
		@Test(dependsOnMethods="loginTest")
		public void searchTest()
		{
			System.out.println("search Test");
		}
	//test should be independent..not to dependent
		//Total tests run: 3, Passes: 0, Failures: 1, Skips: 2
		//try to avoid priority also, all tests are independent,
		//crud operation: 
		
		//@Test t1
		//create the user
		
		//@Test t2(depends=t1)//dont depent on anoter test, better writ the same creation here also its better, if top fails here also fails
		//update the user,
		//1.create a new user 
		//2.then particular user we take userid=2
		//3. pick same user and update
		//4. delete the user
        //5.Check the user is delete(all assertions  is needed)
}
