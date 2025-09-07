package Datatypes;

public class defaultValues {
	
	int a;
	String str;
	float f;
	double d;
	boolean bl;
	char c;
	long l;
	
	static int sa;
	static String sstr;
	static float sf;
	static double sd;
	static char sc;
	static long sl;
	static boolean sbl;
	
	
void calling1()
	
	{
		System.out.println("default value of int is: " + a );
		System.out.println("default value of String is: " + str );
		System.out.println("default value of float is: " + f );
		System.out.println("default value of double is: " + d );
		System.out.println("default value of boolean is: " + bl );
		System.out.println("default value of char is: " + c );
		System.out.println("default value of long is: " + l );
		
	}
		static void calling2()
		
		{
			System.out.println("default value of int is: " + sa );
			System.out.println("default value of String is: " + sstr );
			System.out.println("default value of float is: " + sf );
			System.out.println("default value of double is: " + sd );
			System.out.println("default value of boolean is: " + sbl );
			System.out.println("default value of char is: " + sc );
			System.out.println("default value of long is: " + sl );
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		defaultValues obj1= new defaultValues();
		System.out.println("***************For instance varibles the default vaues are below**********");
		System.out.println("_______________________________________");
		obj1.calling1();
		System.out.println("_______________________________________");
		System.out.println("***************For static varibles the default vaues are below**********");
		System.out.println("_______________________________________");
		calling2();
		obj1.callingmeth3();

	}

	void callingmeth3()
	{
		int a;
		System.out.println("hi");
		//System.out.println(a);
	}
}
