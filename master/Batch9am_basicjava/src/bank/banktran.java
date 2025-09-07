package bank;

public class banktran{
	
	static float currentbalance =10000.00f;
	static String cname="Narendra";
	
public static void greetcustomer()
{
System.out.println("Welcome to the bank Mr :"+ cname);
}


float getbalance()
{
  
return currentbalance;
	
}

 static void deposit(int amount)
{
	currentbalance=currentbalance+amount;
	
System.out.println("Amount "+ amount +"has been deposited successfully" );

}

 static void withdraw(float amount)
{
	currentbalance=currentbalance-amount;
	System.out.println("Amount "+ amount +"has been withdrawn successfully" );
	
}
	public static void main(String[] args)
	{
		System.out.println("naren");
		
		banktran obj1= new banktran();

		greetcustomer();
		System.out.println("the avialble balance for today is:"+obj1.getbalance());
		System.out.println("************************************");
		withdraw(1000.50f);
		System.out.println("************************************");
		deposit(500);
		System.out.println("************************************");
		System.out.println("the closing balance is :"+ currentbalance);

		

	}
}
	