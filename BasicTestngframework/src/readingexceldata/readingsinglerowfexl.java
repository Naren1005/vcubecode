package readingexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readingsinglerowfexl {
	@Test
	public void readfromexcel() throws IOException {

		FileInputStream fis= new FileInputStream("D:\\Vcube java selenium recordings\\Seleniumdatafortesting.xlsx");

		XSSFWorkbook W= new XSSFWorkbook(fis);
		XSSFSheet sht= W.getSheet("Lalitha");



		String cellval=sht.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellval);

	}
}
