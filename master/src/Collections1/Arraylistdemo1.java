package Collections1;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al= new ArrayList();
		
		al.add("X");
		al.add("10.22");
		al.add("Zebra");
		al.add("Amma");
		al.add("B");
		al.add("Cat");
		al.add("Naren");
		
		System.out.println(al);
		
		System.out.println(al.size());
		System.out.println(al.get(3));
		al.set(2,"alp");
		System.out.println(al);
		
		System.out.println(al.contains("Naren"));
		System.out.println(al.isEmpty());
		al.remove(4);
		al.remove("Cat");
		al.add(3,"Vindhya");
		System.out.println(al);
		/*for(int i=0; i<al.size();i++){
			
			System.out.println("at the index of " + i+"the values present is  "+ al.get(i)); 
		}*/
		/*for(Object e:al)
		{
			System.out.println(e);
		}*/
		
		// using the iterator method.
		System.out.println("Iterator method");
		
		Iterator itr=al.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
