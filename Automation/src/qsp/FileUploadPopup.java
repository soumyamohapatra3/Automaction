package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("./driver/resume.docx");
Thread.sleep(3000);
driver.findElement(By.id("cv")).sendKeys("resume.docx");
	}

}
