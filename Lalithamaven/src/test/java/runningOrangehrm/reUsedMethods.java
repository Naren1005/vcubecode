package runningOrangehrm;

import java.io.File;
import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;


public class reUsedMethods extends executeTestCases{
	static JavascriptExecutor js;
	public WebElement xp(String k)
	{
		return driver.findElement(By.xpath(p.getProperty(k)));
	}
	public void t(int g) throws InterruptedException {

		int h=1000*g;
		Thread.sleep(h);
	}
	public void ss(String a) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshots/"+a+".jpg");
		FileHandler.copy(src, trg);
		
	}
	
	public static void highlightelement(WebElement elem) {


		 js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid red;')", elem);
	}
}
