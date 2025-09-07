package DATATYPES;

import java.util.ArrayList;

public class Arraylistandhashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar=new ArrayList();
		
		ar.add("A");//0
		ar.add(100);//1
		ar.add("tom");//2
		ar.add(10.22);//3
		
		System.out.println("size of array list is   ->" + ar.size());
		System.out.println("at index 2  " + ar.get(2));
		System.out.println("At index 1  " + ar.get(1));
		
		ar.add(10.23);//4
		ar.add(22);//5
		System.out.println("size of array list is   ->" + ar.size());
		
		ar.add(6);
		System.out.println("size of array list is   ->" + ar.size());
		ar.remove(6);
		System.out.println("size of array list after removing   ->" + ar.size());
		
		for(int i=0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(10);
		System.out.println(ar1.get(0));
		
		ArrayList<String> ar2=new ArrayList<String>();
		
		ar2.add("Naren");
		System.out.println(ar2.get(0));
		
	}

}
