package parallelpack;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class crossbowser {
	static WebDriver driver;
	
  @Test
  public void titleafterlogin() throws InterruptedException {
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		System.out.println("title before login:  "+ driver.getTitle());
		driver.findElement(By.xpath("//input [@type='text']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("selenium");
		Thread.sleep(2000);
		//for submit button
		driver.findElement(By.xpath("//input[@tabindex='3']")).click();
		// for clear button
		//driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td[2]/input")).click();
		
		
		
	
  }
  @AfterMethod
  public void closebrowser() {
	  
		driver.quit();
  }

//  @BeforeClass  //chrome browser
//  public void chbrowser() {
//	  System.setProperty("webdriver.chrome.driver", "D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		
//		 driver= new ChromeDriver();
//		driver.manage().window().maximize();
//	  
//  }
  
  //edge browser  D:\software_install setup\chromedriver-win64\chromedriver-win64
  @BeforeClass
  public void edbrowser() {
	  System.setProperty("webdriver.edge.driver", "D:\\software_install setup\\edgedriver_win64\\msedgedriver.exe");
		
		 driver= new EdgeDriver();
		driver.manage().window().maximize();
	  
  }
}
