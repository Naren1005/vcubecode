package keyBoardActions;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alertsokclass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Vcube java selenium recordings\\Class videos\\Selenium\\htlmfiles\\Alert Message.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
//		Thread.sleep(2000);
//
//		l.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();


	}

}
