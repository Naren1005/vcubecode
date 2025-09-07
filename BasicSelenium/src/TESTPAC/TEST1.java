package TESTPAC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.naren.com");
		
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		driver.quit();
		
	

	}

}
