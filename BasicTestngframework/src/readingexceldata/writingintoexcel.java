package readingexceldata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFChart;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class writingintoexcel {
  @Test
  public void readfromexcel() throws IOException {
	  
	  FileInputStream fis= new FileInputStream("D:\\Vcube java selenium recordings\\Seleniumdatafortesting.xlsx");
	  
	  XSSFWorkbook W= new XSSFWorkbook(fis);
	  XSSFSheet sht= W.getSheet("Naren");
	  
	  XSSFRow r0=sht.createRow(0);
	  
	  
	  XSSFCell r0c0=r0.createCell(0);
	  r0c0.setCellValue("Hi I am naren");
	  
	  FileOutputStream fos=new FileOutputStream("D:\\Vcube java selenium recordings\\Seleniumdatafortesting.xlsx");
	  W.write(fos);

	  
  }
}
