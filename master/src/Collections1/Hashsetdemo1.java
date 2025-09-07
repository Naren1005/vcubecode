package Collections1;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* we dont have index concept , elements are inserted randomly, 
		we need use the actual value instead of specifying the index no.
		we dont have set method
		we dont have get method.
		*/
		
HashSet hs= new HashSet();

hs.add(100);
hs.add(null);
hs.add("Naren");

hs.add("Vindhya");
hs.add(10.360);
hs.add("afsd");

System.out.println(hs);
hs.remove("afsd");
System.out.println(hs.contains("Naren"));
System.out.println(hs.contains("Naen"));

/*for(Object e:hs)
{
	System.out.println(e);
	}*/

Iterator it=hs.iterator();
System.out.println("Using iterator loop");
while(it.hasNext())
{
	System.out.println(it.next());
	}
System.out.println("After removing the element  " + hs);

	}

}
