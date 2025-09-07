package inherAccessmodifier;

public class parentclass1 {
	String name="parent name";

	parentclass1()
	{
		System.out.println("i was called first");
		//this.par();// will be printed fourth
		System.out.println("*******************"); //5
		this.par2(); //6
		System.out.println("i am class var ****" + this.name);//7


		System.out.println("i am parent constructor.");//8
	}

	void par()
	{
		
		System.out.println("i am parent method1");
	}
	void par2()
	{
		String name="Local variable";
		System.out.println("i am parent method2");
		System.out.println("i am method loc var****"   + name);

	}

	

}
