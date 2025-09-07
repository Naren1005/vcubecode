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

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver","D:\\\\software_install setup\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:\\Vcube java selenium recordings\\Class videos\\Selenium\\htlmfiles\\Gender Radio  Button - Copy.html");
		
		WebElement rb=driver.findElement(By.xpath("(//input[@name='gender'])[2]"));
		
		System.out.println("rb.isDisplayed()   :  " +rb.isDisplayed());
		System.out.println("rb.isEnabled()   :  " +rb.isEnabled());
		rb.click();
		System.out.println("rb.isSelected()   :  " +rb.isSelected());
	}

}
