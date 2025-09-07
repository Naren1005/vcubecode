package selenimpac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wbdriverdemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chorme.driver", "D:\\Selnaren\\Selwebdriver_j_file\\chromedriver.exe");

System.setProperty("webdriver.gecko.driver", "D:\\Selnaren\\Selwebdriver_j_file\\geckodriver.exe");
 
	
	WebDriver D1= new ChromeDriver();
//	WebDriver D2= new FirefoxDriver();	
	
	D1.get("https://rahulshettyacademy.com/");
 System.out.println(D1.getTitle());
 System.out.println(D1.getCurrentUrl());
 D1.close();
	
	
	
	}
}
