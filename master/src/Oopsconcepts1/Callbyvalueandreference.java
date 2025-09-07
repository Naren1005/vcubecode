package Oopsconcepts1;

public class Callbyvalueandreference {
	
	int ga;
	int gb;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		
		
		
		
		Callbyvalueandreference obj= new Callbyvalueandreference();
		int d=obj.sum(x, y);
		System.out.println("the value of x and y are   " + x+ ""+ y) ;
		System.out.println(d);
		
		obj.ga=20;
		obj.gb=30;
		obj.swap(obj);
		// after swap
		System.out.println(obj.ga);//i will be changed to 30
		System.out.println(obj.gb);// it will be changed to 20
		

	}
	public int sum(int a, int b)
	{
		 a=25;
		 b=35;
		int c=a+b;
		return c;
		
	}
	
	public void swap(Callbyvalueandreference av)
	{
		int temp=av.ga;
		av.ga=av.gb;
		av.gb=temp;
	}

}
