package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectedListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Desktop/hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListBox);
		s.selectByIndex(0);
		s.selectByValue("s");
		s.selectByVisibleText(" vada");
		s.deselectByIndex(0);
		s.deselectByValue("s");
		s.deselectByVisibleText("vada");
		if(s.isMultiple()==true) {
			System.out.println("List box is multi selected");
		}
		else {
			System.out.println("List box is multi selected");
		}
	}


}


