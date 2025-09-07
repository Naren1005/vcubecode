package Collections1;
import java.util.*;

public class enumeration1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v= new Vector<>();
		v.add("Naren");
		v.add("Hema");
		v.add("Lalitha");
		v.add("Vindhya");
		
		System.out.println(v);
		
		Enumeration<String> e=v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
