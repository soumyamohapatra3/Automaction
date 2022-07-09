package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.POM.LoginPage;

public class TestMethodCls {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void testmaethod() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPage l = new LoginPage();
		PageFactory.initElements(driver,l );
		Thread.sleep(3000);
		l.setUser("admin", "manager");
	}
}
