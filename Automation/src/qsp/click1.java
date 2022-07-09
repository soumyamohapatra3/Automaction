package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.xpath("//a[@class='gb_d']")).click();

	}

}
