package Datatypes;

public class variables1{
	
	int stdid =43;
	String stdname="Lalitha";
	String stdaddress="Sri sai sadhan";
	static int flatno=501;


void student()
{
System.out.println("Student id is :" + stdid);
System.out.println("Student name is :" + stdname);
System.out.println("Student address is :" + stdaddress);
System.out.println("Student flat no is: " +flatno);
}
	public static void main(String[] args)
	{
		System.out.println("naren");
		flatno=602;
		variables1 obj1= new variables1();
		obj1.student();
		System.out.println("-----------------");
		variables1 obj2= new variables1();
		obj2.stdid=4;
		obj2.stdname="vindhya";
		obj2.stdaddress="sri sai sadhan appartment";
		obj2.student();
		

	}
	
	void one()
	{
		System.out.println("hi");
		
	}
	
}
