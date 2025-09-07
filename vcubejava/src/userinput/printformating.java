package userinput;

import java.util.Scanner;

public class printformating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj1=new Scanner(System.in);

		System.out.printf("Please enter the year %n");

		int year=obj1.nextInt();
		System.out.printf("current year is %d", year);
		System.out.println("please enter the current month");
		String month=obj1.next();
		System.out.println("%n");
		System.out.printf("Currnet month is %S", month);


	}

}
