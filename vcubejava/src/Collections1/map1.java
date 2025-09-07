package Collections1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lis= new ArrayList<>();
		
		Map<Integer, String> m=new Hashtable<>();
		m.put(1234, "Guntur");
		m.put(2345,"Hyderabad");
		m.put(4567, "Chennai");
		m.put(5678, "Bangalore");
		//m.put(56789, "Bangalore");
	
	//Retrieval of keys from the map
		Set <Integer> key=m.keySet();
		for(Integer ke: key)
		{
		System.out.println(ke);
		}
		System.out.println();

	// Retrieval of values from the map
		Collection <String> st= m.values();
		for(String st1:st)
		{
			System.out.println(">>>>"+st1);
		}
		System.out.println();
	
	//Retrieval of values using key
		System.out.println(m.get(2345));
		
	//Retrieval of  keya ad values both 
		System.out.println();
		
		Set <Integer> key1=m.keySet();
		for(Integer ke: key1)
		{
		System.out.println(ke+">>>>>>"+m.get(ke));
		}
		//m.replace(56789,"Ahmadabad");
		m.putIfAbsent(56789, "Gujarat");
		System.out.println();
	// to remove a value
		System.out.println("before removing"+m);
		m.remove(1234);
		System.out.println("After removing"+m);
		System.out.println();
		System.out.println("is empty   :-"+m.isEmpty());
		System.out.println();
		System.out.println("before clearing"+m);
			m.clear();
		System.out.println("After clearing"+m);
		System.out.println("is empty   :-"+m.isEmpty());
		
		
	}

}
