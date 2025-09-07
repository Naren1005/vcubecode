package JavaScripexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javascriptenteringtext {
	static WebDriver driver;
	static JavascriptExecutor js;
	@Test
	public void scrollbar() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");

		js= (JavascriptExecutor)driver;
		WebElement w1=driver.findElement(By.xpath("//input [@type='text']"));
		WebElement w2=driver.findElement(By.xpath("//input[@tabindex='2']"));



		js.executeScript("arguments[0].value='selenium'",w1);
		//		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid red;')", w1);
		highlighter(w1);
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='selenium'",w2);
		//		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid red;')", w2);
		highlighter(w2);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//input[@tabindex='3']")));




	}
	public static void highlighter(WebElement elem) {

		
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid red;')", elem);

}
}
