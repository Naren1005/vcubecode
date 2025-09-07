package inherAccessmodifier;

public class usingThis2paramecons {
	String name="parent name";

	usingThis2paramecons()
	{
		this(10);
		this.par();// will be printed fourth
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

	usingThis2paramecons(int a) // will be printed third 
	{
		this(10,5);
		System.out.println("the total area is -."+ a*a);

	}
	usingThis2paramecons(int a,int b) // will be printed second
	{
		this(20,30,40);
		System.out.println("the area of rectangle is -."+ a*b);
	}
	usingThis2paramecons(int a,int b,int c) // will be printed first
	{
		
		System.out.println("the sum of a, b, c is -."+ (a+b+c));
	}
	public static void main(String[] args) {
		new usingThis2paramecons();


	}

}
