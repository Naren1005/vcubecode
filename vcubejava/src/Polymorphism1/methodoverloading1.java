package Polymorphism1;

public class methodoverloading1 {
	
	void add(int a, int b)
	{
		System.out.println("the sum of a and b is :   " + (a+b));
	}
	void add(int a, int b,int c)
	{
		System.out.println("the sum of a ,b  and c is :   " + (a+b+c));
	}
	
	void add(String a,int b)
	{
		System.out.println("My daugher name is : "+ a);
		System.out.println("i have  daughters");
	}

}
