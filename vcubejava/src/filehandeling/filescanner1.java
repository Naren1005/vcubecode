package filehandeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class filescanner1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//File f= new File("D:\\uploads\\narenfilehand.txt");
		File f1=new File("D:\\uploads\\narenfilehand.txt");
		
	    Scanner s1= new Scanner(f1);
		
		
		while(s1.hasNextLine())
		{
		System.out.println(s1.nextLine());
		}
		
		
		s1.close();
		
	}
}
	


