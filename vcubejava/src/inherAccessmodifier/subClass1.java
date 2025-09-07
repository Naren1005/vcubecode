package inherAccessmodifier;



import accessModifier.protectedClass2;



public class subClass1 extends protectedClass2
{
	subClass1()
	{
		System.out.println(" i am default construtor of subclass1.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public
		/*
		 * System.out.println("***** i am main method*"); publicClass1 p=new
		 * publicClass1(); System.out.println("printing the publid id no"+p.id);
		 * p.printidno();
		 */

		//protected cant access in the sub class of different package
		/*
		 * System.out.println("***** i am main method*"); protectedClass2 p=new
		 * protectedClass2(); System.out.println("printing the protected id no"+p.id);
		 * p.printidno();
		 */

		/*
		 * System.out.println("***** i am main method*"); protectedClass2 p=new
		 * protectedClass2(); System.out.println("printing the protected id no"+p.id);
		 * p.printidno();
		 */
		new subClass1();

		grandson obj1=new grandson();


		System.out.println("**************Grand son ************");
		obj1.prop1();

		father obj2= new father();
		System.out.println("**************Father ************");
		obj2.prop1();
		obj2.prop2();
		obj2.prop3();

		grandfather obj3= new grandfather();
		System.out.println("**************Grand father ************");
		obj3.prop4();


	}

}
