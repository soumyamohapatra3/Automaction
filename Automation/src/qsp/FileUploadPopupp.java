package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopupp {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/gechodriver.exe");
	}

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
driver.get("file:///D:/Desktop/nakuri.html");
driver.get("Soumya+Mohaptra+Resume007 (1) (1).docx");
File f = new File("./driver/Soumya+Mohaptra+Resume007 (1) (1).docx");
String  absolutepath = f.getAbsolutePath();
driver.findElement(By.id("cv")).sendKeys(absolutepath);

	}

}
