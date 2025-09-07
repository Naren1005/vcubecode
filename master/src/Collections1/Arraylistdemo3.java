package Collections1;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylistdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to convert an array to array list
		String st[]= {"Naren","Vindhya","Lalitha varshini","Hemalatha"};
		
		for (String a:st)
		{
		System.out.println(a);

	}
		
		ArrayList al= new ArrayList(Arrays.asList(st));
		
		
		System.out.println(al);
		
	}
}
