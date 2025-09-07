package browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
public class checkboxselectionXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("D:\\Vcube java selenium recordings\\Class videos\\Selenium\\htlmfiles\\Country Check box.html");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		



	}

}
