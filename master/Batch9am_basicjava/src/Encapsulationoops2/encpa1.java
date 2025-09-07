package Encapsulationoops2;

public class encpa1 {

	private int pin;
	private String name="Akurathi Venkata Narendra";
	boolean status;
	private float	balance=10000.25f;
	//float withdraw;

	void setpin(int a)
	{
		pin= a;
		System.out.println("the pin is : "+ a);
	}
	
		int getpin()
	{
		return pin;
	}

		void getname()
		{
			System.out.println("hello Mr/Miss:  "+ name);
			System.out.println("your avaialbe balance is :  "+ balance);
		}
	float withdraw(float b)
	{
		balance=balance - b;
		System.out.println("*****withdrawn ammount is "+ b);
		return balance;
	}
	
	void getbalance()
	{
		System.out.println("the current balance is : " + balance);
	}




}
