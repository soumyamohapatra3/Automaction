package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule1 {
@BeforeMethod
public void login() {
	Reporter.log("login",true);
}
@AfterMethod
public void logout() {
	Reporter.log("logout",true);
}
@Test
public void CreatCustomer() {
	Reporter.log("CreatCustomer",true);
}
@Test
public void ModifyCustomer() {
	Reporter.log("ModifyCustomer",true);
}
}


