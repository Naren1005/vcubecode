package basePack;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class baseClass {
	public static WebDriver driver;
	public static Properties p;
 
  @BeforeClass
  public void postcondion() throws IOException  {
	 
	 System.setProperty("webdriver.chrome.driver","D:\\Naren-java work space\\Lalithamaven\\Mybrowser\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  FileInputStream f= new FileInputStream("D:\\Naren-java work space\\Lalithamaven\\src\\datafile\\java\\myData\\data1");
	   p= new Properties();
	  
	  p.load(f);
	 System.out.println(p.getProperty("R"));
	  
	 
  }
//  @AfterMethod
//  public void precondition() {
//	  
//	  //opening my browser
//	  driver.quit();
//	  
	  
  }


