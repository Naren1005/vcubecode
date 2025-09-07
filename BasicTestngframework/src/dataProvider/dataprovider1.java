package dataProvider;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class dataprovider1 {
	static WebDriver driver;
	
	
	
	
	
	  //@BeforeTest //chrome browse
	@Test(dataProvider ="login1")
	  public void chbrowser(String UN,String PW) throws InterruptedException {
		
	
			System.setProperty("webdriver.chrome.driver", "D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
			System.out.println("title before login:  "+ driver.getTitle());
			driver.findElement(By.xpath("//input [@type='text']")).sendKeys(UN);
			driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys(PW);
			Thread.sleep(2000);
			//for submit button
			driver.findElement(By.xpath("//input[@tabindex='3']")).click();
			Assert.assertTrue(driver.findElement(By.xpath("//li[text ()='Welcome selenium']")).isDisplayed());
	}
			
	 
	@DataProvider(name="login1")
	public Object[][] logindata()
	{
		Object ob[][]=new Object[2][2];
		ob[0][0]="selenium";
		ob[0][1]="selenium";
		ob[1][0]="apple";
		ob[1][1]="selenium";
//		ob[2][0]="selenium";
//		ob[2][1]="apple";
		return ob;
		
	}
  @AfterMethod
  public void closebrowser() {
	  
		driver.quit();
  }

  
  
}
