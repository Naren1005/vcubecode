package Oppsconcept2;

public class Testcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//when method is present in the parent and the child class with same 
		//name and same no of arguments is called method over ridding.
		// compile time polymorphism or static polymorphism one to many
		
		//Child class
		Honda obj=new Honda();
		
		//Constructuordemo crd=new Constructuordemo();
		Constructuordemo crd=new Constructuordemo(1,3);
		System.out.println("constructor method sum1 is called");
		crd.sum1();
				
		obj.start();
		obj.refil();
		obj.saftey();
		obj.stop();
		obj.engine();
		
		System.out.println("*********");
		//Parent class
		Classcar c=new Classcar();
		c.start();
		c.stop();
		c.refil();
		c.engine();
		
		//Child class object can be referred by parent class reference variable 
		//this is called dynamic polymorphism or run time polymorphism

		//Also called as Top casting 
		System.out.println("********* Dinamic polymorphisam");
		Classcar c1= new Honda();
		
		c1.start();
		c1.stop();
		c1.refil();
		c1.engine();
		
		
		//Down casting is not allowed and exception will be displayed at run time.
		
	//Honda v= (Honda)new Classcar();// class cast exception will be displayed at the time of run time.
		
		
		
	}

}
