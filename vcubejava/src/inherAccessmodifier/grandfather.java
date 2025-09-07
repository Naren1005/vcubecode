package inherAccessmodifier;

public class grandfather extends father {
	String name="akurathi venkata narendra";
	grandfather()
	{
		System.out.println(" i am grnfather default constructor.");
	}
	void prop4()
	{
		//super.prop1();
		prop1();
		prop2();
		prop3();
		System.out.println("i am grand father and able to access prop 1,2,3 from father and grandson");
		//System.out.println("i am from grandfather -****"+this.name);
		System.out.println("i am from father  ----");
	}
	void prop1()
	{
		System.out.println("i am grand father and prop1******");
	}

	

}
