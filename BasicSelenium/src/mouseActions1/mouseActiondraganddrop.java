package mouseActions1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActiondraganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.drive","D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		 	WebElement w1=driver.findElement(By.id("draggable"));
		 	WebElement w2=driver.findElement(By.id("droppable"));
		 
	 Actions l= new Actions(driver);
		
		 //l.moveToElement(w).perform(); // mouse over
		 //l.contextClick(w).perform(); // right click
		 	l.dragAndDrop(w1, w2).perform();
	
	 
		

	}

}
