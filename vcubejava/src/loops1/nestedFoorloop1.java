package loops1;

public class nestedFoorloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int count=0;

		/*
		 * for(i=1;i<=5;i++) {
		 * 
		 * //System.out.printf("for the %d th minute",i); System.out.println();
		 * for(j=1;j<=i;j++) { System.out.print(i+" ");
		 * 
		 * z++; } }
		 */

		/*
		 * for (i=1;i<=4;i++) { int count=0; System.out.println(); for(j=1;j<5;j++) {
		 * count=count+i; System.out.print(count+" "); z++; } }
		 */
		
		/*
		 * for(i=1;i<=100;i++) { if (i % 2 ==0 && i% 3==0) {
		 * System.out.println(i+" is an even number"); } }
		 */
		/*
		 * int count=1; for(i=1;i<=5;i++) {
		 * 
		 * for(j=1;j<=i;j++) {
		 * 
		 * System.out.print(count+" "); count++; } System.out.println(); }
		 */
		//prime number
		/*
		 * for(i=2;i<=100;i++) { if(1%i==0) { System.out.println(i); } }
		 */
		
		// printing stars
		/*
		 * for(i=1;i<=5;i++) { //int count=0; for(j=i;j>=1;j--) { //count=count+1;
		 * System.out.print("*"); } System.out.println(); }
		 */
		
		// printing 13th table
		
		/*
		 * for(i=13;i<=13;i++) { for(j=10;j>=3;j--) { System.out.println( i +"*"+j+ "="
		 * +(i*j)); } }
		 */
		/*
		 * float weight=4.9f; float totalWeight=weight*1000;
		 * System.out.println(totalWeight);
		 */
		/*
		 * System.out.println(); System.out.println("the loop has been run for : "+ z);
		 * System.out.println("the value of i is:"+i);
		 */
		
		/**for(int i=1;i<=10;i++)
		{
			for(int j=10;j>i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}**/
		int k=1;
		for(int i=1;i<=3;i++)
			{
			
			for(int j=1;j<=7;j++)
			{
				System.out.print((k++)%2 +" ");
			}
			System.out.println();
			}
		

	}

}
