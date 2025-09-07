package Collections1;
import java.util.*;
public class iteration1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al= new ArrayList<>();
		al.add(10);
		al.add(251);
		al.add(252);
		al.add(253);
		al.add(254);
		al.add(255);
		System.out.println(al);
		
		Iterator<Integer> i=al.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
			i.remove();
		}
		System.out.println(al);

	}

}
