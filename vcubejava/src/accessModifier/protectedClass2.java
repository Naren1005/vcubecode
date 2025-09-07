package accessModifier;

public class protectedClass2 {
	
	protected int id=101;
	protected protectedClass2() //constructor
	{
		
		System.out.println("i am a constructor of the protected class.");
		
		id=102;
	}
	protected void printidno()
	{
		System.out.println("i am protected method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***** i am main method*");
		protectedClass2 p=new protectedClass2();
		System.out.println("printing the protected id no"+p.id);
		p.printidno();

		
	}

}
