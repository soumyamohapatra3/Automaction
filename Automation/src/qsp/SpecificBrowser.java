package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificBrowser {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the tittle which has to be close");
		String expectedTittle = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.xpath("//span[.='Continue with Google']")).click();
		driver.findElement(By.xpath("//span[.='Continue with Apple']")).click();
		Set<String> allwh = driver.getWindowHandles();
		for (String wh:allwh) {
			driver.switchTo().window(wh);
			String actualTittle = driver.getTitle();
			if(actualTittle.contains(expectedTittle)) {
				driver.close();
			}
		}
	}
}
		

		


