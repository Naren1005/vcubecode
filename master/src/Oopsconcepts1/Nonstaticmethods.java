package Oopsconcepts1;

public class Nonstaticmethods {
	
	public static void main(String[] args) {
		
		Nonstaticmethods obj=new Nonstaticmethods();
		obj.test1();
	int	d=obj.test2();
	System.out.println("sum of a and b is  " + d);
	
	String s=obj.test3();
	System.out.println("it is a string "  +s);
	
	int div=obj.test4(30,10);
	System.out.println("this is div  "+ div);
	
	}
	
	// non static methods. to call non static method an object need to be created with the class name.
	// void does not return any value
	//return type =void
	// main method data type is void as it will never return a value.
public void test1() {
	System.out.println("what ever is mentioned before method name it is the data type");
}
//return type= int

public int test2()
{
	System.out.println("*********test2 method has been called***********");
	int a=10;
	int b=20;
	int c= a+b;
return c;
	}
	

//return type= int

public String test3()
{
	System.out.println("*********test3 method has been called**********");
	
	String s="Selenium";
	return s;
}

// int return type
// a and b are input parameters.
public int test4(int a, int b)
{
	System.out.println("*******test4 method has been called**********");
	
	int d= a/b;
	return d;
}
}
