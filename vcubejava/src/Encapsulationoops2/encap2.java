package Encapsulationoops2;

import java.util.Scanner;

public class encap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj2=new Scanner(System.in);
		System.out.println("please enter the pin : \n");
		int pin1= obj2.nextInt();
		System.out.println("please enter the with draw ammount :\n");
		float wit1=obj2.nextFloat();
		encpa1 obj1=new encpa1();
		obj1.getname();
		obj1.setpin(pin1);
		obj1.getpin();
		obj1.withdraw(wit1);
		obj1.getbalance();
		obj2.close();
		
	}

}
