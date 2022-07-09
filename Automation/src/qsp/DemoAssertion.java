package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAssertion {
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
@Test
public void VerifyTittle() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	String expectedTittle = "Google";
	String actualTittle = driver.getTitle();
	if(actualTittle.equals(expectedTittle)) {
System.out.println("Tittle is matching and pass");
	}
	else {
		System.out.println("Tittle is  not matching and fail");
	}
	driver.close();
}
}
