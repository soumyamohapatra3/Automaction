package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenPOP {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.xpath("//label[@title='Date Of Birth']")).click();
		driver.findElement(By.xpath("//input[@placeholder='DOB']")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("(//select[@data-event='change'])[1]"));
		month.click();
		Select s1 = new Select(month);
		s1.selectByIndex(7);
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("(//select[@data-event='change'])[2]"));
		year.click();
		Select s2 = new Select(year);
		s2.selectByValue("1995");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'31')])")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		boolean check = driver.findElement(By.id("policynumberError")).isDisplayed();
		if (check == true) {
			System.out.println("policy number Error is displayed");
		} else
			System.out.println("policy number Error is NOT displayed");
		driver.close();
	}

}