package exception1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exceptrycatch {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub.
		Scanner obj1= new Scanner(System.in);
		System.out.println("enter the first number");
		int fnum=obj1.nextInt();
		System.out.println("enter the second number");
		int snum=obj1.nextInt();
		int total=0;
		
		
		
		
		
		try
		{
		 total=fnum/snum;
		}
		catch (ArithmeticException ae)
		{
			System.out.println("you had entered the number as zero");
			System.out.println(ae.fillInStackTrace());
			System.out.println(ae.toString());
			throw ae;
		}
		
		finally 
		{
			System.out.println("finally block has been executed");
		}
		
		//System.out.println(total);
		File file=new File("D:/naren.docx");
		FileInputStream fis= new FileInputStream(file);
		System.out.println(fis);
		

	}

}
