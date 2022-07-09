package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("file:///D:/Desktop/page1.html");
	Thread.sleep(3000);
	driver.findElement(By.id("t1")).sendKeys("qsp");
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	driver.findElement(By.id("t2")).sendKeys("jsp");
	}

}
