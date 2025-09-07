package Screenshots;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class screenshots {
	static WebDriver driver;
	

	@Test
	public void titleafterlogin() throws IOException, InterruptedException {

		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");

		SS("home");
		
		System.out.println("title before login:  "+ driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		SS("up");
		driver.findElement(By.name("Submit")).click();

		Thread.sleep(2000);
		
		SS("afterlogin");

	}
	@AfterMethod
	public void closebrowser() {

		//driver.quit();
	}

	public void SS(String a) throws IOException
	{
		
		File T3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File S3= new File("./screenshot/image1"+ a +".jpg");
		FileHandler.copy(T3, S3);
		
	}
	@BeforeClass
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver= new ChromeDriver();
		driver.manage().window().maximize();

	}

}
