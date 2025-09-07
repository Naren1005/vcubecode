package JavaScripexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javascriptexc1 {
	 static WebDriver driver;
  @Test
  public void scrollbar() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
				
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(350,2300)");
		
		js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.linkText("Diversity & Inclusion")));
		Thread.sleep(2000);
		
		//js.executeScript("arguments[0].setAttribute('style','border:2px solid red; backgroud : solid yellow')");
		
		driver.findElement(By.linkText("Diversity & Inclusion")).click();
	  
	  
  }
}
