package Exceptionhandling;

import java.util.Scanner;

public class Exceptionone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Unchecked exception
		
		System.out.println("program started");
		Scanner sc=new Scanner(System.in);
		
		/*Example 1
		 *  
		System.out.println("Enter a number:  ");
		
		int num= sc.nextInt();
		System.out.println(100/num); Arithmetic  exception by entering the no as 0
		*/
		
		/*Example 2  ArrayIndexOutOfBoundsException
		
		int a[]=new int[5];
		
		System.out.println("enter the no between [0-4]");
		
		int pos=sc.nextInt();
		
		System.out.println("enter value for the position");
		
		int value=sc.nextInt();
		
		a[pos]=value;
		*/
		
		//Example 3 NumberFormatException
		
		
		
		String s="naren";
		
	    try
	    {
		int a= Integer.parseInt(s);
		System.out.println(a);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Exception handelled");
			System.out.println(e.getMessage());
	    }
	    
	    
	          
		
		//Example 4 NullPointerException
		/*String b=null;
		try {
		System.out.println(b.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception handelled");
			System.out.println(e.getMessage());
		}*/
		
		
		System.out.println("program completed");
		System.out.println("program exited");
	}

}
