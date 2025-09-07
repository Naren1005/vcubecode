package Oopsconcepts1;

public class Methodoverloadin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloadin1 obj= new Methodoverloadin1();
		obj.sum();
		obj.sum(10.22);
		obj.sum(10);
		obj.sum(20,30);
	}
	
	// main method can be overloaded
	public static void main(int k) {
		// TODO Auto-generated method stub

	}
	
	/*We can’t create a method inside a method.
	Methods cant have the same name with same parameters.
	To overload it we can have same method name with different parameters/arguments with different data types and with in the same class is called method overloading.

	Methods are independent.

	Main method can be over loaded as well.
*/
	
	public void sum()
	{
	System.out.println("Method with no arguments");
	}

	public void sum(int i)
	{
	System.out.println("Method with one arguments "+i);
	}
	
	public void sum(int k,int h)
	{
	System.out.println("Method with 2 arguments  and there sum is  " + k + h);
	}
	
	public void sum(double l)
	{
	System.out.println("Method with different datat type as arguments  " + l );
	}
}

