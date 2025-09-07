package Collections1;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashsetdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set1=new HashSet();
		
		LinkedHashSet set3=new LinkedHashSet();
		
		set3.add(100);
		set3.add(888);
		set3.add(300);
		set3.add(1690);
		set3.add(10980);
		
		System.out.println("this is set3  "+set3 );
		
		set1.add(8);
		set1.add(2);
		set1.add(99);
		set1.add(4);
		set1.add(5);
		
		System.out.println("Set 1 values   "+set1);
		
		HashSet set2=new HashSet();
		set2.add(6);
		set2.add(4);
		set2.add(5);
		System.out.println("Set 2 values   " +set2);
		
	//Union
		//set1.addAll(set2);
		//System.out.println("Union  "+ set1);
		
		// intersection
		//set1.retainAll(set2);
		//System.out.println("interseption  "+ set2);
		
		//difference 
		
		//set1.removeAll(set2);
		//System.out.println("difference  "+ set1);
		
		System.out.println(set1.containsAll(set2));
		
	
	}

}
