package DATATYPES;
import java.util.Hashtable;

public class Hashtable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Hashtable ht=new Hashtable();
	
	ht.put("A","Test");
	ht.put("B","Naren");
	
	System.out.println(ht.get("A"));
	
	ht.put(1,205);
	ht.put(2,2005);
		
	System.out.println(ht.get(2));
	System.out.println(ht.size());
	
	

	}

}
