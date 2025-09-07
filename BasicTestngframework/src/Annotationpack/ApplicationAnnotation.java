package Annotationpack;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class ApplicationAnnotation {
	static WebDriver driver;
	
  @Test
  public void titleafterlogin() {
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		System.out.println("title before login:  "+ driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).click();
	
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
