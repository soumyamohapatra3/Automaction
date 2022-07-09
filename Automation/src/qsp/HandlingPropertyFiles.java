package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFiles {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
	FileInputStream fis= new FileInputStream("‪D:\\Desktop\\CommonData.Property.txt");
	Properties p=new Properties();
	p.load(fis);
	String url = p.getProperty("url");
    String un = p.getProperty("username");
    String pw= p.getProperty("password");
    System.out.println(url);
    System.out.println(un);
    System.out.println(pw);
	}

}
