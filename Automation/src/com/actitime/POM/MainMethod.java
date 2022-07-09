package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MainMethod {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPage l = new LoginPage();
		PageFactory.initElements(driver,l );
		Thread.sleep(3000);
		l.setUser("admin", "manager");
	}
}
