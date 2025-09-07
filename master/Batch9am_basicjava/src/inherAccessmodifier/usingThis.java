package inherAccessmodifier;

public class usingThis {
	String name="parent name";
	
	usingThis()
	{
		System.out.println("i am parent constructor.");
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
	
	usingThis(int a)
	{
		this();
		System.out.println("i am parent parametarised constructor.");
		this.par();
		System.out.println("*******************");
		this.par2();
		System.out.println("i am class var ****"   + this.name);
		
	}
	public static void main(String[] args) {
		new usingThis(125);
		
		
	}

}
