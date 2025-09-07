package accessModifier;

public class defaultclass2 {
	
	  int id=101;
	  defaultclass2() //constructor
	{
		
		System.out.println("i am a constructor");
		id=102;
	}
	 void printidno()
	{
		System.out.println("i am public method"+id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		defaultclass2 pv=new defaultclass2();
		
		System.out.println(pv.id);
		pv.printidno();
	}

}
