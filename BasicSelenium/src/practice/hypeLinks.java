package practice;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class hypeLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver","D:\\\\software_install setup\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:\\Vcube java selenium recordings\\Class videos\\Selenium\\htlmfiles\\Hyper links.html");

		WebElement hl1=driver.findElement(By.linkText("The Rock Says"));
		hl1.click();
		System.out.println("the tile of the rock is:   " +driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement hl2=driver.findElement(By.linkText("T & J"));
		
		hl2.click();
		System.out.println("T & J title is  :   " +driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		driver.quit();
	}

}
