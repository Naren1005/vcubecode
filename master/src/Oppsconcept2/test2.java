package Oppsconcept2;

import java.util.Scanner;



public class test2 {
	
	int age;
	String name;
	
	
	public void meth1(int age, String name)
	{
	this.age=age;
	this.name=name;
	}
	
	public void display()
	{
		System.out.println("age of the person is  :" + this.age);
		System.out.println("name of the person is  :" + this.name);
	}
	


	public static void main(String[] args) {
		
		
		 /*Scanner scn = new Scanner(System.in);

	        // input is a string ( one word )
	        // read by next() function
		 System.out.println("\n enter value for string one ");
		 String str1 = scn.next();
		
	    System.out.println("Str1 value is  : \n"+ str1);
	       
	    System.out.println(" enter value for string two \n");
	        
	    String str2=scn.next();
	       
	        System.out.println("\n Str2 value is  :  " + str2);
	        
	        System.out.println(" enter value for string three \n");
	        
	        int str3=scn.nextInt();
	        
	        System.out.println("\n Str3 value is  :  " + str3);
	        
System.out.println(" enter value for string four \n");
	        
	        float str4=scn.nextFloat();
	        
	        System.out.println("\n Str4 value is  :  " + str4);
	        
		
		test2 obj=new test2();
		obj.meth1(42,"naren");
		obj.display();
		*/
		int vb=10;
		if (vb<12)
		{
			System.out.println("if loop executed");
		}
		
		if (true)
		{System.out.println(1);
		   if(false)
		{
			System.out.println(2);
			if (true) {
				System.out.println(3);
			}
		}
		}
		
		
		// TODO Auto-generated method stub
		/* int maxScore = 500;

		    // The actual score of the user
		    int userScore = 423;
		  float af= (float)userScore/maxScore ;
	      System.out.println("the value of af is   " + af);
	      */
		  
	
		
	}   

	}


