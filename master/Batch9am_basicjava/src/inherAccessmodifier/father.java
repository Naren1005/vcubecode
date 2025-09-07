package inherAccessmodifier;

public class father extends grandson{
	
	String name="Naren";
	father()
	{
		  
		System.out.println(" i am father constructor.");
	}
	void prop2()
	{
		String name="narendra";
		System.out.println("i am father prop2 method and able to access prop 1 from grandson");
		System.out.println(name);
	}
	void prop3()
	{
		System.out.println("i am father prop3 method and able to access prop 1 from grandson");
	}

	

}
