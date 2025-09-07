package filehandeling;

import java.io.File;
import java.io.IOException;

public class filehandle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//File f= new File("D:\\uploads\\narenfilehand.txt");
		File f1=new File("./nare.txt");
		System.out.println(f1.createNewFile());
//		System.out.println(f.createNewFile());
//		System.out.println(f.delete());
//		System.out.println(f.exists());
		
//		if(f.exists())
//		{
//			f.delete();
//		 System.out.println(f.createNewFile());
//		}
		//System.out.println(f.isHidden());
		//System.out.println(f.setReadable(true));
	}

}
