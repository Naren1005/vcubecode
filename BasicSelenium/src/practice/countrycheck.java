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

public class countrycheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver","D:\\\\software_install setup\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:\\Vcube java selenium recordings\\Class videos\\Selenium\\htlmfiles\\Country Name.Htm");	
		
		WebElement cl=driver.findElement(By.id("CheckList"));
		List<WebElement> dd=cl.findElements(By.tagName("option"));
		
		System.out.println(dd.get(10).getText());
		
		System.out.println("Total no of countries in the list are : " + dd.size());
		
		Select sc=new Select(cl);
		//***for selecting all the countries in the drop down.
//		for(int j=0;j<dd.size();j++)
//		{
//			sc.selectByIndex(j);
		
//		}
		
//** for selecting specific country using the index
		
		//sc.selectByIndex(5);
		//sc.selectByIndex(215);
//** for selecting specific country using visible text key
		
		//sc.selectByVisibleText("Monaco");
		
//** for selecting specific country using contains key
		sc.selectByContainsVisibleText("Mo");
		
	
		



	}

}
