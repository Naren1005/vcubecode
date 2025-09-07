package Oopsconcepts1;

public class Staticnonstaticmethods1 {

	static String name= "Vindhya"; // static global variable
	int age =2;  // non static global variable
	
	/* static variable or static method can be called directly or using the class name.
	 * for calling non static variable or method object need to be created*/
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(10,20);
		Staticnonstaticmethods1.sum(30,40);
		
		Staticnonstaticmethods1 obj=new Staticnonstaticmethods1();
		int k =obj.age=6;
		System.out.println(k);
		System.out.println(name);
		System.out.println(obj.age);
		//obj.sum(55,66);// static methods can be called using the obj but not the best practice.
		
	}
	
	public void nonstatcimethod()
	{
		System.out.println("Non static method");
	}
	public static void  sum(int a , int b)
	{
		System.out.println("name of my daughter is   " + name);
		
		System.out.println("sum of a + b is  =  " + (a+b));
	}

}
