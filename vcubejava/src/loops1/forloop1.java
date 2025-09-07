package loops1;

public class forloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		//int j=1;

		/*
		 * for(;i<=10;) { //System.out.println(i+"-"+"i am Lalitha Varshini");
		 * 
		 * i+=2; System.out.println(i); j++; }
		 * System.out.println("i executed for in the 1st loop " + j + " times");
		 * 
		 * 
		 * for (;;) { if (i<20) { System.out.println("i am second for loop"+i); i+=2; }
		 * 
		 * else
		 * 
		 * break;
		 * 
		 * 
		 * }
		 */
		;
		for(i=1;i<=3;i++)
		{
			int count=i;
			for(int j=1;j<=4;j++)
			{
				
				System.out.print(count+" ");
				count++;

			}
			System.out.println();
		}

	}

}
