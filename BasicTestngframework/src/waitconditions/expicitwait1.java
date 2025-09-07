package waitconditions;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.support.ui.WebDriverWait;
public class expicitwait1 {
	static WebDriver driver;
	
  @Test
  public void titleafterlogin() throws InterruptedException {
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		System.out.println("title before login:  "+ driver.getTitle());
		driver.findElement(By.xpath("//input [@type='text']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("selenium");
		Thread.sleep(2000);
		//for submit button
		
		WebElement log=new WebDriverWait(driver, Duration.ofSeconds(17)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@tabindex='30']")));
//		driver.findElement(By.xpath("//input[@tabindex='3']")).click();
		/*	this error will be displayed if element is not found org.openqa.selenium.TimeoutException: Expected condition failed: 
			waiting for element to be clickable: 
			By.xpath: //input[@tabindex='30'] (tried for 17 second(s) with 500 milliseconds interval)
		 */
		log.click();
		// for clear button
		//driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/input")).click();
		
		
		
	
  }
  @AfterMethod
  public void closebrowser() {
	  
		driver.quit();
  }

  @BeforeClass
  public void launchbrowser() {
	  System.setProperty("webdriver.chrome.driver", "D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
	  
  }

}
