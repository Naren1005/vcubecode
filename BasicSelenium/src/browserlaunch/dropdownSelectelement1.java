package browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
public class dropdownSelectelement1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");

		driver.manage().window().maximize();

		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).click();

		driver.switchTo().frame(driver.findElement(By.name("rightMenu"))); // moved to frame using the web element id or name rightmenu
		WebElement dd= driver.findElement(By.id("loc_code"));

		Select sc=new Select(dd);
		Thread.sleep(4000);
		
		List<WebElement> lc=    dd.findElements(By.tagName("option"));

		System.out.println("the total no of elements in the dropdown are :" + lc.size());
		
		for(int i =0;i<lc.size();i++)
		{
		sc.selectByIndex(0);
		Thread.sleep(500);
		sc.selectByIndex(i);
		Thread.sleep(500);
		
		}
		//sc.selectByValue("Job Title");
		//sc.selectByContainsVisibleText("Job Title");
		//sc.selectByVisibleText("Job Title");
		
		//sc.selectByValue("-1");
		//driver.switchTo().defaultContent();
		



	}

}
