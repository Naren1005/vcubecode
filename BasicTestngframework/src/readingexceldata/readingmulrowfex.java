package readingexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readingmulrowfex {
  @Test
  public void readfromexcel() throws IOException {
	  
	  FileInputStream fis= new FileInputStream("D:\\Vcube java selenium recordings\\Seleniumdatafortesting.xlsx");
	  
	  XSSFWorkbook W= new XSSFWorkbook(fis);
	  XSSFSheet sht= W.getSheet("Lalitha");
	  
	  
	  for (int a=0;a<=58;a++)  // as we know the no of rows so we are able to put the last value as 58
	  {
		  String cellval=sht.getRow(a).getCell(0).getStringCellValue();
	  System.out.println(cellval);
	  }
	  
  }
}
