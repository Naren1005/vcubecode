package runningOrangehrm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class scrippting extends reUsedMethods {

	public void login() throws IOException, InterruptedException  {

		driver.get(p.getProperty("url"));
		
		WebElement un=xp("XUN");
		un.sendKeys(p.getProperty("uname"));
		highlightelement(un);
		WebElement pw=xp("XPWD");
		highlightelement(pw);
		pw.sendKeys(p.getProperty("passwd"));
		WebElement sub= xp("XSUB");
		
		highlightelement(sub);
		t(2);
		ss("Landing_page");
		sub.click();
		
		ss("After sucessful Login");


	}
	public void oneemp() throws InterruptedException, AWTException, IOException {


		Actions act=new Actions(driver);
		WebElement pim=driver.findElement(By.xpath(p.getProperty("XPIM")));

		act.moveToElement(pim).perform();
		//act.doubleClick(pim).perform();
		//act.contextClick(pim).perform();

		driver.findElement(By.xpath(p.getProperty("XADD"))).click();

		driver.switchTo().frame(driver.findElement(By.xpath(p.getProperty("XFRAME"))));
		t(2);

		xp("XID").clear();
		xp("XID").sendKeys("485710");
		xp("XLNAME").sendKeys("Narendra");
		xp("XFNAME").sendKeys("Akurathi");
		xp("XMNAME").sendKeys("Venkata");
		xp("XNNAME").sendKeys("Naren");

		act.moveToElement(driver.findElement(By.xpath(p.getProperty("XPHOTO")))).click().perform();
		StringSelection s= new StringSelection("C:\\Users\\naren\\OneDrive\\Desktop\\250720081715.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		t(2);

		Robot Rob= new Robot();
		Rob.keyPress(KeyEvent.VK_CONTROL);
		Rob.keyPress(KeyEvent.VK_V);
		Rob.keyRelease(KeyEvent.VK_CONTROL);
		Rob.keyRelease(KeyEvent.VK_V);

		t(2);

		Rob.keyPress(KeyEvent.VK_ENTER);
		Rob.keyRelease(KeyEvent.VK_ENTER);
		ss("_before_save");
		xp("XSAVE").click();
		//xp("XBACK").click();
		ss("after_save");
		t(4);
		
	}

	public void multipleemp() throws InterruptedException, AWTException, IOException {

		FileInputStream fis= new FileInputStream("D:\\Naren-java work space\\Lalithamaven\\src\\datafile\\java\\myData\\Seleniumdatafortesting.xlsx");

		XSSFWorkbook w= new XSSFWorkbook(fis);
		XSSFSheet sht= w.getSheet("empdetails");

		for(int i=1;i<=sht.getLastRowNum();i++)
		{
			int EMPID=(int)sht.getRow(i).getCell(0).getNumericCellValue();
			String Lname=sht.getRow(i).getCell(1).getStringCellValue();
			String Fname=sht.getRow(i).getCell(2).getStringCellValue();
			String Mname=sht.getRow(i).getCell(3).getStringCellValue();
			String Nname=sht.getRow(i).getCell(4).getStringCellValue();

			Actions act=new Actions(driver);
			WebElement pim=driver.findElement(By.xpath(p.getProperty("XPIM")));

			act.moveToElement(pim).perform();
			//act.doubleClick(pim).perform();
			//act.contextClick(pim).perform();

			driver.findElement(By.xpath(p.getProperty("XADD"))).click();

			driver.switchTo().frame(driver.findElement(By.xpath(p.getProperty("XFRAME"))));
			t(2);

			xp("XID").clear();
			xp("XID").sendKeys(String.valueOf(EMPID));
			xp("XLNAME").sendKeys(Lname);
			xp("XFNAME").sendKeys(Fname);
			xp("XMNAME").sendKeys(Mname);
			xp("XNNAME").sendKeys(Nname);


			act.moveToElement(driver.findElement(By.xpath(p.getProperty("XPHOTO")))).click().perform();
			StringSelection s= new StringSelection("D:\\Naren-java work space\\Lalithamaven\\MyPhotos\\"+Lname+".jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
			t(2);

			Robot Rob= new Robot();
			Rob.keyPress(KeyEvent.VK_CONTROL);
			Rob.keyPress(KeyEvent.VK_V);
			Rob.keyRelease(KeyEvent.VK_CONTROL);
			Rob.keyRelease(KeyEvent.VK_V);

			t(2);

			Rob.keyPress(KeyEvent.VK_ENTER);
			Rob.keyRelease(KeyEvent.VK_ENTER);
			ss(Lname+"_Before_save");
			xp("XSAVE").click();
			t(4);
			xp("XBACK").click();
			ss(Lname+"_After_save");
			driver.switchTo().defaultContent();
			t(2);
		}
		w.close();
	}

	public void editempone() throws IOException, InterruptedException {
		//driver.switchTo().frame(driver.findElement(By.xpath(p.getProperty("XFRAME"))));
		driver.findElement(By.xpath("//div[@id='personal']"));
		ss("before_edit");

		WebElement edib=driver.findElement(By.xpath("//input[@name='EditMain']"));
		highlightelement(edib);
		edib.click();
		
		WebElement cl=driver.findElement(By.xpath("//input[@name='txtEmpLastName']"));
		highlightelement(cl);
		cl.clear();
		WebElement newname=driver.findElement(By.xpath("//input[@name='txtEmpLastName']"));
		
		newname.sendKeys("Naren");
		highlightelement(newname);
		//driver.findElement(By.xpath("//input[@class='savebutton']")).click();
		WebElement sb=driver.findElement(By.xpath("//input[@class='savebutton']"));
		highlightelement(sb);
		ss("After_edit");
		sb.click();
		t(2);
		xp("XBACK").click();
		ss("After_back");
		t(2);
		driver.switchTo().defaultContent();
	}
	public void delemp() throws InterruptedException, IOException {
		driver.switchTo().frame(driver.findElement(By.xpath(p.getProperty("XFRAME"))));
		driver.findElement(By.xpath("//form[@id='standardView']"));

		driver.findElement(By.xpath("(//table[@class='data-table']/tbody/tr/td)[1]"));


		t(4);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();

		System.out.println("alert box message : "+driver.switchTo().alert().getText());
		t(2);
		driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("(//table[@class='data-table']/tbody/tr)[1]")).click(); // to delete 1st row
		t(2);
		WebElement allemp=driver.findElement(By.xpath("//input[@class='checkbox']"));
		highlightelement(allemp);
		allemp.click(); // to delete all the elements in a table
		ss("select_all_emp");
		WebElement del=driver.findElement(By.xpath("//input[@value='Delete']"));
		highlightelement(del);
		del.click();
		ss("Del_aLL_emp");
		
		

	}
}

