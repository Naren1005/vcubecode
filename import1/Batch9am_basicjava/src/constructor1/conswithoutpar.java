package constructor1;

public class conswithoutpar {

	int x = 2222;
	static int y=256;

 	conswithoutpar() {
		this(10);
		abc();
		System.out.println("i am constructor with out parameters");
	}

	conswithoutpar(int a)
	

	{
		this(10, 20);
		System.out.println("i am constructor with 1 parameter = " + a);
		
	}
	

	conswithoutpar(int a, int b)

	{
		this(5, 4, 3);
		System.out.println("i am constructor with 2 parameters = " + (a + b));
	}

	conswithoutpar(int a, int b, int c)

	{
		System.out.println("i am constructor with 3 parameters = " + (a * b * c));
	}

	void abc() {
		int x = 1111;
		int y=56;
		System.out.println("i am instance variable" + this.x);
		System.out.println("i am local variable " + x);
		System.out.println("statci int y:"+y);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new conswithoutpar();
		
		//obj.abc();
		// new conswithoutpar(10);		
		// new conswithoutpar().abc();
		
	}

}
