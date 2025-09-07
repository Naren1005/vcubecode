package Collections1;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 ArrayList<Integer> al4=new ArrayList<>();
		 ArrayList<Integer> al2=new ArrayList<>();
		 al4.add(20);
		 al4.add(0,25);
		 al4.add(21);
		 al4.add(202);
		 al4.add(203);
		 al4.add(204);
		 al4.add(205);
		 al4.add(206);
		 al4.add(null);
		 al4.add(20);
		 al4.remove(0);
		 al4.set(4,444);
		 System.out.println("Array list 1 values before adding values  "   +al2);
		 al2.addAll(al4);
		 al2.remove(1);
		 System.out.println("comparing two array list using equal " +al4.equals(al2));
		 
		 System.out.println("Array list 2 values " +al2);
		 
		 System.out.println("Array list 1 values "+ al4);
		 System.out.println("size of the arraylist "+ al4.size());
		 System.out.println("to get a specific index  " +al4.get(0));
		 System.out.println("contains - "+ al4.contains(20));
		 al4.clear();
		 System.out.println("after clearing all values  " + al4);
		 System.out.println("comparing the entire collection " +al4.containsAll(al2));
		 
	}

}
