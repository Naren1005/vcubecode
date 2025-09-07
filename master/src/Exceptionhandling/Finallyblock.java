package Exceptionhandling;

public class Finallyblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unchecked exception
		
		String b=null;
		try {
		System.out.println(b.length());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception handelled");
			System.out.println(e.getMessage());
	    }
		finally
		{
			System.out.println("Finally block has got executed");
		}

	}

}
