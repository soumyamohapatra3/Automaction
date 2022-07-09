package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
@Test(priority=1,invocationCount=3)
public void Createcustomer() {
	Reporter.log("Createcustomer",true);
}
@Test(priority=2,dependsOnMethods = "Createcustomer")
public void Modifycustomer() {
	Reporter.log("Modifycustomer",true);
}
@Test(dependsOnMethods = { "Createcustomer","Deletcustomer"})
public void Deletcustomer() {
	Reporter.log("Deletcustomer",true);
}
}
