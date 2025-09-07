package Oopsconcepts1;

public class Wraperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 •	Wrapper classes: converting one data type to the other data type.
For converting string to int we need to use integer.parseint
For converting string to double we need to use double.parseint
For converting string to in boolean need to use boolean.parseint
For converting int to string we need to use string.valueof

When try to convert below string in to an int

“110A”- we get number format exception as it is not a pure integer value.
*/

		String a="100";
		System.out.println("before parsing  "+ (a+20));
		//after parsing  a into an integer variable
		
		int b=Integer.parseInt(a);
		System.out.println("after parsing  " +(b+30));
		
		String bo="10.20";
		
		System.out.println("before parsing  "+ (bo+20));
		//after parsing  a into an integer variable
		
		double dot= Double.parseDouble(bo);
				
		System.out.println("after parsing  " +(dot+30));
		
		String boa="true";
		
		System.out.println("before parsing  "+ (bo+20));
		//after parsing  a into an integer variable
		
		boolean booa= Boolean.parseBoolean(boa);
				
				
		System.out.println("after parsing  " + booa);
		
		// converting an integer to string 
		
		int c=100;
		
		System.out.println(c);
		
		String ct=String.valueOf(c);
		System.out.println(ct+20);
		
		
		
	}

}
