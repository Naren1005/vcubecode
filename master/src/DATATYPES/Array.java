package DATATYPES;

public class Array {

	public static void main(String[] args)
	{
		//To store similar data type values we use arrays.
		// initiate array.
		//lowest bound/index of array is 0 and highest bound/index is n-1(n is size of array)
		// one dimensional array
		// two dimensional array.
		
		//adv- store multiple values in a single variable with same data types.
		// size is fixed - static array.
		// stores only similar data types.
		// dis adv- 
		int i[]= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println("value of i[2] is " + i[2]);
		System.out.println("length of i is"+i.length);// will give the size of array.
		//System.out.println("value of i[2] is " + i[4]);//Index 4 out of bounds for length 4(array index out of bound exception
	// print all the arrays
		for(int j=0; j<i.length;j++)
		{
			System.out.println(i[j]);
			
		}
		// double array.
		double d[]= new double[3];
		d[0]=41.20;
		d[1]=41.21;
		d[2]=41.22;
		
		System.out.println(d[2]);
			
		
		char ch[]= new char[4];
		ch[0]='a';
		ch[1]='v';
		ch[2]='l';
		ch[3]='h';
		System.out.println(ch[3]);
		boolean bo[]=new boolean[2];
		bo[0]= true;
		bo[1]=false;
		System.out.println(bo[1]);
		
		
		String st[]=new String[4];
		st[0]="Naren";
		st[1]="Hema";
		st[2]="Lalitha";
		st[3]="Vindhya";
		System.out.println(st[2]);
		
		
		
		//Object is a class and object array is used to store different data types.
		Object ob[]=new Object[6];
		ob[0]="Naren";
		ob[1]=10;
		ob[2]="31/07/1982";
		ob[3]="Guntur";
		ob[4]='M';
		ob[5]=10.22;
		System.out.println(ob[3]);
		
		
		
	}
}
