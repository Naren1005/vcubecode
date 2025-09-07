package browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class titleCheck1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  String beforlogintitle	=driver.getTitle();
	  if(beforlogintitle.equals("OrangeHRM - New Level of HR Management"))
			  {
		  System.out.println("Expected landing screen title is displayed.");
			  }
	  else
	  {
		  System.out.println("Landing screen title is not matching");
	  }
	  
	  driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).click();
		
		String afterlogintitle=driver.getTitle();
		if(afterlogintitle.equals("OrangeHRM"))
		{
			  System.out.println("Expected home screen title is displayed after login.");
				  }
		  else
		  {
			  System.out.println("home screen title is not matching after login");
		  }
		Thread.sleep(3000);
	WebElement ws=driver.findElement(By.xpath("//li[text()='Welcome selenium']"));
	System.out.println(ws.getText());
			
	}

}
