package browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class dropdown {

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

		List<WebElement> lc=    dd.findElements(By.tagName("option"));

		System.out.println("the no of elements in the drop down are  :"+lc.size());

		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Change Password")).click();

		//driver.findElement(By.linkText("Logout")).click();


	}

}
