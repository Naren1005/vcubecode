package Methodcatagories;

public class mwrwop{  // method with out parameters and with return type.
	
	int stdid=202;
	String stdname;
	String stdaddress;


String student()
{
  int stdid1= 202;
  
  String name1="Vindhya";
  //System.out.println(stdid1+name1);
  return stdid1+" - "+name1; 
	
}
	public static void main(String[] args)
	{
		System.out.println("naren");
		
		mwrwop obj1= new mwrwop();
		System.out.println("the student name and id is :"+obj1.student());
		System.out.println(obj1.stdid);
		
		//System.out.println(obj1.student());

	}
}