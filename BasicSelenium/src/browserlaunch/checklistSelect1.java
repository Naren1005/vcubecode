package browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
public class checklistSelect1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("D:\\Vcube java selenium recordings\\Class videos\\Selenium\\htlmfiles\\Country Name.Htm");

		driver.manage().window().maximize();
		
		WebElement dd=driver.findElement(By.id("CheckList"));
		
		List<WebElement> cl= dd.findElements(By.tagName("option"));
				System.out.println("the total number of countries in the list are : " + cl.size());
				
				for(int i=0;i<cl.size();i++)

				{
					System.out.println(cl.get(i).getText());
				}		

		

		
		



	}

}
