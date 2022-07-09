package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {
	static {
		System.setProperty("webdrive.chrome.driver", "./drivere/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys( "admin");
		driver.findElement(By.name("pwd")).sendKeys( "manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains ("Enter"));
		String title = driver.getTitle();
		System.out.println(title);

	}

}
