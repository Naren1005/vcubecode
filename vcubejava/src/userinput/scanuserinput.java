package userinput;

import java.util.Scanner;

public class scanuserinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj1=new Scanner(System.in);
		System.out.println("What is your name");
		String name =obj1.nextLine();
		System.out.printf("Hey %s, how are you?\n", name);
		String status=obj1.nextLine();
		System.out.println("what is your age\n");
		int age=obj1.nextInt();
		System.out.println("Thanks for the information");
		
obj1.close();
	}

}
