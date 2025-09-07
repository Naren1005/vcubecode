package Robootclass;




import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class choosefilebutton {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");

		driver.manage().window().maximize();


		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(5000);
		WebElement w=driver.findElement(By.id("pim"));
		Actions l= new Actions(driver);
	
		l.moveToElement(w).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Add Employee']")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
		driver.findElement(By.name("txtEmployeeId")).clear();
		driver.findElement(By.name("txtEmployeeId")).sendKeys("433334");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Varshini");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Lalitha");
		driver.findElement(By.name("txtEmpMiddleName")).sendKeys("Akurathi");
		driver.findElement(By.name("txtEmpNickName")).sendKeys("Lalli");
		Thread.sleep(2000);
		
		l.moveToElement(driver.findElement(By.id("photofile"))).click().perform();
		
	StringSelection ss= new StringSelection("C:\\Users\\naren\\OneDrive\\Desktop\\250720081715.jpg"); // go the location of the file and copy the file.
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	
	
	Robot R= new Robot(); // for pasting the file 
	
	R.keyPress(KeyEvent.VK_CONTROL);
	R.keyPress(KeyEvent.VK_V);
	R.keyRelease(KeyEvent.VK_CONTROL);
	R.keyRelease(KeyEvent.VK_V);
	
	Thread.sleep(2000);
	R.keyPress(KeyEvent.VK_ENTER);
	R.keyRelease(KeyEvent.VK_ENTER);
	//driver.findElement(By.xpath("//*[@id=\"frmEmp\"]/div/div[1]/div[2]/div[2]/input[2]")).click();
	driver.findElement(By.id("btnEdit")).click();
	
	//Thread.sleep(6000);
	
	
	//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"rightMenu\"]")));
	//driver.findElement(By.xpath("/html/body/div[5]/input"));
	

	}

}
