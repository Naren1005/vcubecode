package accessModifier;

public class publicClass1 {
	
	public int id=101;
	public publicClass1() //constructor
	{
		
		System.out.println("i am a constructor");
		id=102;
	}
	public void printidno()
	{
		System.out.println("i am public method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***** i am main method*");
		publicClass1 p=new publicClass1();
		System.out.println("printing the publid id no"+p.id);
		p.printidno();

		
	}

}
