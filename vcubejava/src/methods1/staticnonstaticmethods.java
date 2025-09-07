package methods1;


public class staticnonstaticmethods
{
 int capacity=5;
 static String vehicleName="Honda amaze";

 public static void main(String[] args)

{
  System.out.println("i am main method");
  staticnonstaticmethods obj1= new staticnonstaticmethods();
  	
  	staticmethod1();  // calling static method
  	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
  	obj1.nonstaticmethod1();  // calling non static method
  	System.out.println(obj1.capacity);

}

void nonstaticmethod1()
{

 System.out.println("I am non static method");
 System.out.println("I am calling static variable" + vehicleName); // calling static variable into non static method.
System.out.println("I am calling non static variable : " +capacity);// calling non static variable in to non static method.

}

static void staticmethod1()
{
System.out.println("I am static method");
System.out.println("I am calling static variable" + vehicleName); //calling static variable into static method.
System.out.println("I am calling non static variable : " + new staticnonstaticmethods().capacity) ; //calling non static variable in to static method using object.
}	
	

}
