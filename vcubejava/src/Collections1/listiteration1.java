package Collections1;

import java.util.*;

public class listiteration1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al= new ArrayList<>();
		al.add(10);
		al.add(251);
		al.add(252);
		al.add(253);
		al.add(254);
		al.add(255);
		System.out.println(al);
		ListIterator<Integer> i =al.listIterator();
		
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		i.add(65);
		System.out.println();
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}

	}

}
