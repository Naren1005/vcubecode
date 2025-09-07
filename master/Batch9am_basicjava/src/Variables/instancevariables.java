package Variables;

public class instancevariables
{
	int isnVar=10;  // instance variable can be accessed using the object of the main method
	static int stint=1005;// static variable can be accessed with out using the object 
	String firstName="venkata narendra";
	
	
public static void main(String[] args)
{
   System.out.println("I am main method");
   
	
	instancevariables obVar= new instancevariables();
	
	System.out.println(obVar.isnVar);
	System.out.println(new instancevariables().name);
	int localVariable = 25;  //Local variables and can be used with in the declared method only.7
	System.out.println(localVariable);
	obVar.meth1();
	System.out.println(stint);
	System.out.println(new instancevariables().firstName);
	System.out.println("meth1"+new instancevariables().isnVar);
	obVar.defvalues();
}

void meth1()
{
	int methvar=256;
	System.out.println("meth1"+methvar);
	System.out.println("static variable"+stint);
	System.out.println("meth1"+new instancevariables().isnVar);
	System.out.println("meth1"+isnVar);
}
 String name="Narendra";
 
 void defvalues()
 {
	 	  
	 int a=1;
	 String b;
	 float c;
	 System.out.println("a="+a);
 }
}