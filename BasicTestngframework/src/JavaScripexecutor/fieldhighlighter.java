package JavaScripexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class fieldhighlighter {
	public static WebDriver driver;
  @Test
  public static void highlighter(WebElement elem) {

		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid red;')", elem);

	  
	  
  }
}
