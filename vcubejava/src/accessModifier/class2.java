package accessModifier;



public class class2 

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public
		/*
		 * System.out.println("***** i am main method*"); publicClass1 p=new
		 * publicClass1(); System.out.println("printing the publid id no"+p.id);
		 * p.printidno();
		 */

		//private access modifier 
	
// protected
		
		
		System.out.println("***** i am main method*");
		protectedClass2 p=new protectedClass2();
		System.out.println("printing the protected id no"+p.id);
		p.printidno();
		 
		 
		
			/*
			 * System.out.println("***** i am main method*"); protectedClass2 p=new
			 * protectedClass2(); System.out.println("printing the protected id no"+p.id);
			 * p.printidno();
			 */
		
		
		//default
		/*
		 * defaultclass2 pv=new defaultclass2();
		 * 
		 * System.out.println(pv.id); pv.printidno();
		 */
		
		/*
		 * System.out.println("***** i am main method*"); defaultClass2 p=new
		 * defaultClass2(); System.out.println("printing the default id no"+p.id);
		 * p.printidno();
		 */
	}

}
