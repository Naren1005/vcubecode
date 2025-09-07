package filehandeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileinputfilestream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//File f= new File("D:\\uploads\\narenfilehand.txt");
		File f1=new File("D:\\uploads\\narenfilehand.txt");
		
		FileInputStream fis= new FileInputStream(f1);
		
		int asci;
		while((asci=(fis.read()))!=-1)
		{
		System.out.print((char)asci);
		
		}
		fis.close();
	}
}
	


