package Methodcatagories;

public class mwrwp{ //method with parameters and with return type.
	
	

String student(int id,String name,boolean t,double af,int age)
{
 
  return id+" :"+name+" :"+t+":  "+af+":  "+age; 
	
}
	public static void main(String[] args)
	{
		System.out.println("naren");
		
		mwrwp obj1= new mwrwp();
		
		System.out.println(obj1.student(102, "Lalitha",true,4.1,5));
		
		//System.out.println(obj1.student());

	}
}