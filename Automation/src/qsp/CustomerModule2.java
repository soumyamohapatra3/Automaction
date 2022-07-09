package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CustomerModule2 {
	@BeforeClass
	public void OpenBrowser() {
		Reporter.log("openBrowser",true);
	}
	@AfterClass
	public void CloseBrowser() {
		Reporter.log("CloseBrowser",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout(){
		Reporter.log("logout",true);
	}
@Test(priority = 1,invocationCount = 2)
public void EditCustomer() {
Reporter.log("EditCustomer",true);
}
@Test 
public void RegisterCustomer() {
	Reporter.log("RegisterCustomer",true);
}
@Test
public void DeletCustomer() {
	Reporter.log("DeletCustomer",true);
}
}