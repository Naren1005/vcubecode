package accessModifier;

public class privatClass1 {
	
	private  int id=101;
	private privatClass1() //constructor
	{
		
		System.out.println("i am a constructor");
		id=102;
	}
	private void printidno()
	{
		System.out.println("i am public method"+id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		privatClass1 pv=new privatClass1();
		
		System.out.println(pv.id);
		pv.printidno();
		
	}

}
