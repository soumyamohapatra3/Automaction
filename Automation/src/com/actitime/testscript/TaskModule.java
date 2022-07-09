package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule extends BaseClass {
	@Test
	public void CreateCustomer() {
		Reporter.log("CreateCustomer",true);
	}
	@Test
	public void ModifyCustomer() {
		Reporter.log("ModifyCustomer",true);
	}
	@Test
	public void DeletCustomer() {
		Reporter.log("DeletCustomer",true);
	}
}
