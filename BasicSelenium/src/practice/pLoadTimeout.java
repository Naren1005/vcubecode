package practice;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class pLoadTimeout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver","D:\\\\software_install setup\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		Instant Stime=Instant.now();
		System.out.println(Stime);
		driver.get("https://www.hyrtutorials.com/");
		
		Instant etime=Instant.now();
		System.out.println(etime.toString());
		Duration du=Duration.between(Stime, etime);
		System.out.println("total page load time is :" + du.toSeconds()+"seconds");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		
		driver.quit();
		
		

	}

}
