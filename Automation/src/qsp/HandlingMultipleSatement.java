package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleSatement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in/");
		List<WebElement> disco = driver.findElements(By.xpath("(//a)"));
		int count = disco.size();
		System.out.println(count);

		for(int i = 0;i< count;i++) {
			String text= disco.get(i).getText();
			System.out.println(text);}
		driver.close();

	}



}




