package userinput;

import java.util.Scanner;

public class Evenoddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj1=new Scanner(System.in);
		System.out.println("please enter the number");
		
		int evenno=obj1.nextInt();
		if(evenno%2==0 && evenno%evenno==0)
		{
		System.out.println("the above no is an even number");	
		}
		else
		{
			System.out.println("the given number is an odd number");
		}
		obj1.close();
	}
	

}
