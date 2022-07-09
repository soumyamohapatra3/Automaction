package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWithoutParent {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("//span[.='Continue with Google']")).click();
		driver.findElement(By.xpath("//span[.='Continue with Apple']")).click();
		String pwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			Thread.sleep(2000);
			driver.switchTo().window(wh);
			if(wh.equals(pwh)) {
			}
			else {
				driver.close();
			}
		}

	}
}
