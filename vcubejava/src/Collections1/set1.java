package Collections1;

import java.util.*;

public class set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	HashSet<Integer> hs= new HashSet<>();
////
////
//		hs.add(10);
//		hs.add(null);
//		hs.add(101);
//		hs.add(110);
//		hs.add(1000);
//		hs.add(10);
//		hs.add(25);
//		System.out.println(hs);  //[null, 101, 1000, 25, 10, 110] will not insert in the order that was provided.
//		hs.remove(10);
//		System.out.println(hs);
//
//
//		for(Integer i:hs)
//		{
//			System.out.println(i);
//		}
//		System.out.println(hs.isEmpty());
//		//		hs.clear();
//		//		System.out.println(hs.isEmpty());
//		System.out.println(hs.contains(25));

//		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
//		
//		lhs.add(10);
//		lhs.add(null);
//		lhs.add(101);
//		lhs.add(110);
//		lhs.add(1000);
//		lhs.add(10);
//		lhs.add(25);
//		System.out.println(lhs); // [10, null, 101, 110, 1000, 25] will insert in the order that was provided.
//		lhs.remove(10);
//		System.out.println(lhs);
//		
//		
//		for(Integer i:lhs)
//		{
//			System.out.println(i);
//		}
//		System.out.println(lhs.isEmpty());
//		//hs.clear();
//		System.out.println(lhs.isEmpty());
//		System.out.println(lhs.contains(25));
//		
		
		TreeSet<Integer> ts=new TreeSet<>();

		ts.add(10);
		//ts.add(null); // tree set will not allow nulls 
		ts.add(101);
		ts.add(110);
		ts.add(1000);
		ts.add(10);
		ts.add(25);
		System.out.println(ts); //[10, 25, 101, 110, 1000] will insert in the sorted order.a
		//ts.remove(10);
		System.out.println("in Assending order: " + ts);
		System.out.println("in decensing order: " + ts.descendingSet());
		System.out.println(ts);
		System.out.println("lowest element is :" +ts.first());
		System.out.println("highest element is : " +ts.last());
		System.out.println(ts);
		System.out.println("Removed first element  : " + ts.pollFirst());
		System.out.println("Removed last element  : " + ts.pollLast());
		
		System.out.println(ts);
		
		for(Integer i:ts)
		{
			System.out.println(i);
		}
		System.out.println(ts.isEmpty());
		ts.clear();
	System.out.println(ts.isEmpty());
		System.out.println(ts.contains(25));
	}

}
