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

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver","D:\\\\software_install setup\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");	
		Actions act= new Actions(driver);


		WebElement uname=driver.findElement(By.xpath("//input[@name='txtUserName']"));
		uname.sendKeys("selenium");
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		WebElement pwd=driver.findElement(By.xpath("//input[@name='txtPassword']"));
		pwd.sendKeys("selenium");
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

		driver.findElement(By.xpath("//input[@name='Submit']")).click();

		Thread.sleep(4000);
		//WebElement pim=driver.findElement(By.xpath("//span[text()='PIM']"));

		//act.moveToElement(pim).perform();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='rightMenu']")));

		WebElement dd=driver.findElement(By.xpath("//select[@id='loc_code']"));

		List<WebElement>   lc=dd.findElements(By.tagName("option"));

		Select sc=new Select(dd);
		System.out.println("the total count is  :" + lc.size());

		for(int j= 0;j<lc.size();j++)
		{
			System.out.println(lc.get(j).getText());
		}
		
		sc.selectByIndex(1);
		//sc.selectByVisibleText("Job Title");

		driver.switchTo().defaultContent();


		//	 WebElement he=driver.findElement(By.xpath("//span[text()='Help']"));
		//	 act.moveToElement(he).perform();




	}

}
