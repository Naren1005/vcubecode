package Collections1;

import java.util.Arrays;
import java.util.LinkedList;

public class Linkedlistdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList ll=new LinkedList();
		
		ll.add(100);
		ll.add("a");
		ll.add("10.2");
		ll.add("Naren");
		ll.add("true");
		ll.add('b');
		
		ll.add(5, "five");
		System.out.println(ll);
		System.out.println("used for each loop");
		
		LinkedList dup_ll=new LinkedList();
		
		dup_ll.addAll(ll);
		dup_ll.add(56);
		System.out.println(dup_ll);
		
		//ll.addAll(dup_ll);
		//System.out.println("Union   "+ ll);
		//ll.retainAll(dup_ll);
		//System.out.println("interseption   "+ dup_ll);
		
		ll.containsAll(dup_ll);
		System.out.println("difference   " +dup_ll);
		
		
		
		/*System.out.println("dup linked listed values");
		dup_ll.add(10);
		dup_ll.add(2,"index two");
		dup_ll.removeAll(ll);
		System.out.println("printing dup_ll values after rmoving"+dup_ll);
		System.out.println("checking if list is empty or not  " + dup_ll.isEmpty());
		for(Object e:ll) {
			
			System.out.println(e);
		}
		String s[]= {"dog", "cat"};
		LinkedList ls=new LinkedList(Arrays.asList(s));
		System.out.println(ls);
		
		ll.addFirst("Akurathi");
		ll.addLast("venkata");
		
		System.out.println(ll);
		
		l
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println("after removing" +ll);*/
	}

}
