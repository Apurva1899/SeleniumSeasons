package testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinHotelApp {

 @BeforeMethod
 public void setup()
 {
	 System.out.println("Browser started");
		System.out.println("app launched");
 }
 
@AfterMethod
public void teardown() {
	System.out.println("browser closed");
}

	@Test(priority=2)//enabled=false)
 public void loginTest()
  {
	Assert.assertTrue(true);
	System.out.println("login successfull");
   }
	
	@Test(priority=1)
	 public void registrationTest()
	  {
		System.out.println("registration successfull");
	   }
	@Test(priority=3)
	 public void forgotpasswordTest()
	  {
		System.out.println("forgotpassword successfull");
	   }
	@Test(priority=4,dependsOnMethods="loginTest")
	 public void changepasswordTest()
	  {
		System.out.println("changepassword successfull");
	   }
}
