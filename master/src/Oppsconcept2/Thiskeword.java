package Oppsconcept2;

public class Thiskeword {
	int x;
	int y;
	//Constructor. 
	Thiskeword(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println("the value of x is  "+x);
		System.out.println("the value of y is  "+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thiskeword twp=new Thiskeword(200,500);
	 //  twp.x=10;
	 //  twp.y=200;
	   twp.display();

	}

}
