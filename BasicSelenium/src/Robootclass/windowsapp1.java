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

public class windowsapp1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		Robot R= new Robot(); // for pasting the file 

		R.keyPress(KeyEvent.VK_A);
		R.keyPress(KeyEvent.VK_D);
		R.keyPress(KeyEvent.VK_M);
		R.keyPress(KeyEvent.VK_I);
		R.keyPress(KeyEvent.VK_N);
		R.keyRelease(KeyEvent.VK_A);
		R.keyRelease(KeyEvent.VK_D);
		R.keyRelease(KeyEvent.VK_M);
		R.keyRelease(KeyEvent.VK_I);
		R.keyRelease(KeyEvent.VK_N);
		
		R.keyPress(KeyEvent.VK_TAB);
		R.keyRelease(KeyEvent.VK_TAB);


		Thread.sleep(2000);

		R.keyPress(KeyEvent.VK_A);
		R.keyPress(KeyEvent.VK_D);
		R.keyPress(KeyEvent.VK_M);
		R.keyPress(KeyEvent.VK_I);
		R.keyPress(KeyEvent.VK_N);
		R.keyRelease(KeyEvent.VK_A);
		R.keyRelease(KeyEvent.VK_D);
		R.keyRelease(KeyEvent.VK_M);
		R.keyRelease(KeyEvent.VK_I);
		R.keyRelease(KeyEvent.VK_N);
		
		R.keyPress(KeyEvent.VK_TAB);
		R.keyRelease(KeyEvent.VK_TAB);
		
		R.keyPress(KeyEvent.VK_ENTER);
		
		R.keyRelease(KeyEvent.VK_ENTER);
		


	}

}
