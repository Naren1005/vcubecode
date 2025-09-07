package Oopsconcepts1;

public class Car {
	
	int mod;
	int wheel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*new Car this is the object of Car class
		 *new keyword is used to create the object.
		a,b,c are referring to the object
		
		*/
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		a.mod=2015;
		a.wheel=4;
		
		System.out.println("it's  "+  a.mod +"  model"+ "  and it has "+a.wheel +"  wheel's");
	}

}
