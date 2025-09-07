package AdvancedXpath;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class functional_starswith {
	static WebDriver driver;
	
  @Test
  public void titleafterlogin() throws InterruptedException {
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		System.out.println("title before login:  "+ driver.getTitle());
		driver.findElement(By.xpath("//input[starts-with(@name,'txtU')]")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[starts-with(@name,'txtP')]")).sendKeys("selenium");
		Thread.sleep(2000);
		//for submit button
		driver.findElement(By.xpath("//input[starts-with(@name,'S')]")).click();
		// for clear button
		//driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/input")).click();
		

  }
  @BeforeClass
  public void launchbrowser() {
	  System.setProperty("webdriver.chrome.driver", "D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		driver.manage().window().maximize();

}
}