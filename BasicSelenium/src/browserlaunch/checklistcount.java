package browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
public class checklistcount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("D:\\Vcube java selenium recordings\\Class videos\\Selenium\\htlmfiles\\Country Name.Htm");

		driver.manage().window().maximize();
		
		WebElement dd=driver.findElement(By.id("CheckList"));
		
		List<WebElement> cl= dd.findElements(By.tagName("option"));
				
		Select cls=new Select(dd);
		for(int i=0;i<cl.size();i++)
		{
		cls.selectByIndex(i);
		}
//		cls.selectByContainsVisibleText(" Bra");
//		cls.selectByVisibleText(" Mexico");
		

		
		



	}

}
