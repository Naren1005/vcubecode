package Collections1;

import java.util.*;
//***for Priority queue
 //addition:  add, offer
 // retrieval: peek
// Removal: poll, remove, clear

//*** for ArrayDeque
//addition:  add,addFirst,addLast, offer,offerFirst,offerLast
// retrieval: peek,peekFirst,peekLast
//Removal: remove, removeFirst,removeLast,poll,pollFirst,pollLast clear

public class priorityque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		
		
//		p.add(2);
//		p.offer(10);
//		p.add(1);
//		p.offer(3);
//		p.add(7);
//
//		System.out.println(p);
//		System.out.println("Using the peek method   :" +p.peek()); //Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty
//		System.out.println(p.contains("Checking contains : "+7));
//		System.out.println("Removing from the que:  "+p.remove(1));
//		System.out.println(p);
//		System.out.println("Using the peek method   :" +p.peek());
//		//		 p.clear();
//		System.out.println(p);
//		System.out.println("Removes the head : " +p.poll());//Retrieves and removes the head of this queue,or returns null if this queue is empty.
//		System.out.println(p);
		
		ArrayDeque<String> ad=new ArrayDeque<>();
		
		ad.add("Banana");
		ad.addFirst("Kiwi");
		ad.addLast("Mango");
		ad.add("strwberry");
		ad.offer("Guava");
		ad.offerLast("peach");
		
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad);
		System.out.println();
		System.out.println(ad);
		System.out.println(ad.pollFirst());
		System.out.println(ad);
		System.out.println();
		System.out.println(ad);
		System.out.println(ad.pollLast());
		System.out.println(ad);
	}

}
