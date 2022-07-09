package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHightAndWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		WebElement un = driver.findElement(By.id("username"));
		int height= un.getSize().getHeight();
		int width= un.getSize().getWidth();
		System.out.println("Height = "+height);
		System.out.println("Width = "+width);
		driver.close();
		
		
		
	}

}