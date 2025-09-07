package Oppsconcept2;

public class Hsbcbank implements Usbank,Brazilbank { // we are acheving multiple inheritance.
	
	//if a class is implementing any interface, then it is mandatory to define all the methods of interface
	
	//usbank method overriding
public void credit() 
{
	System.out.println("HSBC----credit");
}
	
	public void transfer() 
	{
		System.out.println("HSBC----transfer");
	}
	
	public void debit() 
	{
		System.out.println("HSBC----debit");
	}
	//separate methods
	public void homeloan() 
	{
		System.out.println("HSBC----homeloan");
	}
	
	public void carloan() 
	{
		System.out.println("HSBC----carloan");
	}
	//brazil method over riding. 
	public void mutalfunds() 
	{
		System.out.println("Brazilbank----mutalfunds");
	}
}
