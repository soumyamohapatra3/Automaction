package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertion1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public void VerifyTittle() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	String expectedTittle = "Soogle";
	String actualTittle = driver.getTitle();
	SoftAssert s = new SoftAssert();
	s.assertEquals(actualTittle, expectedTittle);
	driver.close();
	s.assertAll();
}

}
