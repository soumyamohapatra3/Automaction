package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement untbx ;                                              //declaraction

	@FindBy(name="pwd")
	private WebElement pstbx ;

	@FindBy(xpath="//div[.='Login ']")
	private WebElement Login ;



	public void setUser(String un,String pw) {
		untbx.sendKeys(un);                                                 //utilizaction
		pstbx.sendKeys(pw);
		Login.click();
	}                                                                     


}
