package keyBoardActions;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alertsokcancelclass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Vcube java selenium recordings\\Class videos\\Selenium\\htlmfiles\\AlertsOkCancel.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	//	System.out.println(driver.switchTo().alert().getText()); // will get no such element when try to get text after closing the alert popup
		
		WebElement w= driver.findElement(By.id("demo"));
		
		if(w.getText()=="You pressed Cancel!")
		{
		System.out.println("User has pressed cancel button on the alert: ");
		}
		else
		{
			System.out.println("User has pressed ok button on the alert:  ");
		}
		
	
	}

}
