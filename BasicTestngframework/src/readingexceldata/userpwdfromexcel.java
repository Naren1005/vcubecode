package readingexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class userpwdfromexcel {
	static WebDriver driver;

	@Test
	public void readfromexcel() throws IOException, InterruptedException {




		FileInputStream fis= new FileInputStream("D:\\Vcube java selenium recordings\\Seleniumdatafortesting.xlsx");

		XSSFWorkbook W= new XSSFWorkbook(fis);
		XSSFSheet sht= W.getSheet("appdata");
		int frn=sht.getFirstRowNum();
		System.out.println("first row num is :" + frn);
		int lrn=sht.getLastRowNum();
		System.out.println("last row num is :" + lrn);
		
		String un=sht.getRow(1).getCell(0).getStringCellValue();
		String pwd=sht.getRow(1).getCell(1).getStringCellValue();
		int numcv=(int) sht.getRow(2).getCell(0).getNumericCellValue();
		int numcv1=(int) sht.getRow(2).getCell(1).getNumericCellValue();
		int numcv2=(int) sht.getRow(2).getCell(3).getNumericCellValue();
		System.out.println("Cell 0 value: " +numcv);
		System.out.println("cell 1 value: "+ numcv1);
		System.out.println("cell 3 value: "+ numcv2);
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		System.out.println("title before login:  "+ driver.getTitle());
		driver.findElement(By.xpath("//input [@type='text']")).sendKeys(un);
		String b=driver.findElement(By.xpath("//input [@type='text']")).getAttribute("value");
		System.out.println("get attribute :"  + b);
		String a=driver.findElement(By.className("bodyTXT")).getText();
	System.out.println("get text:"+a);
		driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();


	}
	
//	
//	 
//	  driver.quit(); }
	 

	@BeforeClass
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\software_install setup\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
}
