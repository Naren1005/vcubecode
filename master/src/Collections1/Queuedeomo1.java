package Collections1;

import java.util.PriorityQueue;

public class Queuedeomo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pq=new PriorityQueue();
		
		pq.add("H");
		pq.add("B");
		pq.add("C");
		pq.add("D");
		pq.add("f");
		pq.offer("Naren");
		//pq.add(100);
	
		
		System.out.println(pq);
		System.out.println("Head element  "+pq.element()); 
		//System.out.println("Head peek   " + pq.peek());
		
		//System.out.println("Removing the 1st element"+pq.remove());
		//System.out.println(pq);
		
		//System.out.println("Removing the 1st element"+pq.poll());
		//System.out.println(pq);
		for( Object e:pq) {
			System.out.println(e);
		}
		
	}

}
