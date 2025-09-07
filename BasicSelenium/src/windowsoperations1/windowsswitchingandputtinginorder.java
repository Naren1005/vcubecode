package windowsoperations1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.*;
public class windowsswitchingandputtinginorder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");

		driver.manage().window().maximize();

		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		Actions l= new Actions(driver);
		
		l.moveToElement(driver.findElement(By.id("help"))).perform();
		
		driver.findElement(By.xpath("//*[@id=\"help\"]/ul/li[2]/a/span")).click();
		System.out.println("title after clicking on support link:  "+driver.getTitle());
		
		Set<String> ow=driver.getWindowHandles(); // we get elements in non sorted order.
		
		System.out.println("the no of opened windows are: "+ ow.size());
		
		ArrayList<String> al= new ArrayList(ow); // we are getting the windows list in order nows
		
	

		//driver.findElement(By.linkText("Logout")).click();


	}

}
