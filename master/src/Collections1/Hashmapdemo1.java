package Collections1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmapdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap hm=new HashMap();
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		
		hm.put(101,"Vindhya");
		hm.put(102,"Naren");
		hm.put(103,"akurathi");
		hm.put(104,"Lalitha Varshini");
		hm.put(105,"Hemalatha");
		hm.put(106,"AKURATHI");
		
		
		
		System.out.println(hm);
		System.out.println(hm.get(101));
		System.out.println(hm.size());
		System.out.println(hm.containsKey(105));
		System.out.println(hm.containsValue("Nren"));
		//System.out.println(hm.remove(103));
		System.out.println(hm);
		
		System.out.println(hm.keySet());// all the keys in set format
		System.out.println("each key in the key list");
		for (Object e:hm.keySet())
		{
			
			System.out.println(e);
		}
		System.out.println("each value in the value list");
		
		for (Object f:hm.values())
		{
			System.out.println("individual value  "+ f);
		}
		System.out.println("each entry in the list indivudually");
		/*for (Object k:hm.entrySet()) 
		{
			System.out.println("Individual entry  "+k);
		}*/
		System.out.println("********entry interface**********");
		for  (Map.Entry l:hm.entrySet())
		{
			System.out.println(l.getKey()+ "  ****"+ l.getValue());
		}
		//System.out.println(hm.values());// return all the values as a collection
		/*hash map methods implemented from map interface
		 * hm.putAll(hm);
		hm.get(101);
		hm.remove(103);
		hm.size();
		hm.containsKey(105);
		hm.containsValue("Naren");
		hm.isEmpty();
		hm.clear();*/
		
		/*Entry methods */
/*hm.keySet()- returns all the keys from hashmap and keys are unique as duplication is not allowed
		//from the method and return type is set.*/
	//	hm.values() -returns all the values from hashmap and return type will be a collection.
		//hm.entrySet() - returns each entry from hashmap
		
		
	}

}
