package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		
		
		 WebElement dayListBox = driver.findElement(By.id("day"));
		 Select s= new Select(dayListBox);
	     s.selectByIndex(30);
	    Thread.sleep(3000);
	   
	    WebElement monthListBox = driver.findElement(By.id("month"));
	    Select s1= new Select(monthListBox);
	    s1.selectByVisibleText("Aug");
	    Thread.sleep(3000);
	    
	    WebElement yearListBox = driver.findElement(By.id("year"));
	    Select s2= new Select(yearListBox);
	    s2.selectByValue("1995");
	    Thread.sleep(3000);
	    
	   
	    
	    
	    		
	    
		

	}

}
