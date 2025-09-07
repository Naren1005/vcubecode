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

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver","D:\\\\software_install setup\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:\\Vcube java selenium recordings\\Class videos\\Selenium\\htlmfiles\\Country Check box.html");
		
		WebElement cb=driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
		System.out.println("cb.isDisplayed()"  + cb.isDisplayed());
		
		System.out.println("cb.isEnabled()"  + cb.isEnabled());
		cb.click();
		System.out.println("cb.isSelected()"  + cb.isSelected());
		Thread.sleep(5000);
		List<WebElement> li=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("The no of displayed check boxes are:  "+li.size());
		
		for(int j=0;j<li.size();j++)
		{
			li.get(j).click();
	}
		System.out.println("cb.isSelected()"  + cb.isSelected());

	}

}
