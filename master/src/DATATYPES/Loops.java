package DATATYPES;

public class Loops {
	
	public static void main(String[] args)
	
	{
		
		/*While loop (initialisation part , conditional part, incremental part) 
Disadvantage of while loop is If we don’t give the incremental part then it will run the program infinite times.
*/
		/*int i=1;
		while (i<=10)
		{
			System.out.println("the value of i is--> "+i);
			i=++i;
			
		}
		System.out.println("*****************");
		for (int a=10;a<=20;a++)
		{
			System.out.println("the value of a is incremented-->"+ a);
		}
		System.out.println("*****************");
		for (int b=20;b>=10;b--)
		{
			System.out.println("the value of b is decremented-->"+ b);
		}
		*/
		int z=1;
		int x=z++;//post increment
		System.out.println("value of z is ->" + z);
		System.out.println("value of x is ->" + x);
		
		int zr=1;
		int xr=++zr;//pre increment
		System.out.println("value of zr is ->" + zr);
		System.out.println("value of xr is ->" + xr);
		
		int zy=1;
		int xy=zy--;//post decrement
		System.out.println("value of zy is ->" + zy);
		System.out.println("value of xy is ->" + xy);
	}

}
