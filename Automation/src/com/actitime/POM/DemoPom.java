package com.actitime.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPom {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main (String[]args) {
		
//	open the chrome browser/
		WebDriver driver = new ChromeDriver();
		
//	Enter the url/
		driver.get("https://demo.actitime.com/");
 
//	Store the username textbox adress as @a1 in the untbx in Back end/
		WebElement untbx = driver.findElement(By.id("username"));
		
//	Refersh and username textbox will get new adress like @p1
		driver.navigate().refresh();
		

//		Trying to enter admin as username  useing old adress i.e @a1 /
		untbx.sendKeys("admin");
	}
}

