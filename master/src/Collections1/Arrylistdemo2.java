package Collections1;

import java.util.ArrayList;
import java.util.Collections;

public class Arrylistdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		al.add("X");
		al.add("Q");
		al.add("P");
		al.add("C");
		al.add("A");
		al.add("B");
		
		ArrayList al_dup=new ArrayList();
		
		al_dup.addAll(al);
		System.out.println(al_dup);
		
		al_dup.removeAll(al);
		System.out.println(al_dup);
		System.out.println(al_dup.isEmpty());
		
		System.out.println("Elements in the array list AL" + al);
		Collections.sort(al);
		System.out.println("After sorting   "+ al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("After reverse sorting   "+ al);
		
		Collections.shuffle(al);
		System.out.println("After shuffeling   "+ al);
		


	}

}
