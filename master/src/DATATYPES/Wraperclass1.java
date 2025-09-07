package DATATYPES;

public class Wraperclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
// String to primitive 
		
		// String to int, boolean, double.
		
		/*String to int
		
		String s=new String("welcome"); // cant convert this to int
		
		String s1="10";
		String s2="20";
		
		System.out.println("Sum of string s1 and s2 is ---> "+( Integer.parseInt(s1)+Integer.parseInt(s2)));
				
		
		
		//String to double
		
		String s2="10.20";
		String s3="20.36";
		
		System.out.println("Sum of string s1 and s2 is ---> "+ 
		(Double.parseDouble(s3)+Double.parseDouble(s2)));
	  
		
		//String to boolean
		
	 String s="false";
	 System.out.println(Boolean.parseBoolean(s));
	 */
		
		// primitive to string
		
		// int, boolean, double,char to string.
		
		int a=10; 
		double d=20.2;
		char c='A';
		boolean b=true;
		
		String s1=String.valueOf(a);
		
		System.out.println("String length is   " +s1.length());
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(b));
		
		
	 

	}

}
