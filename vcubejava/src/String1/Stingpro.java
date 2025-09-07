package String1;

public class Stingpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="java is super";
		String name="Naren";
		String hw="Helloworld";
		String r="";
		char ch;

		for(int i=0;i<name.length();i++)
		{
			ch=name.charAt(i);
			r=ch+r;
		}
		System.out.println(r);

		System.out.println(s1.length());
		int cou=s1.split("\\^").length;
		System.out.println(cou);

		// for checking the occrance of a char in the given string

		int count1=0;
		for(char ch1:hw.toCharArray())
		{

			if(ch1=='l')
			{
				count1 ++;
			}
		}
		
		System.out.println("the number of occurances is :"+ count1);
		
		// to reverse a string
		
		char rev;
		String rev1="";
		for(char va: hw.toCharArray())
		{
			rev=hw.charAt(va);
			rev1=rev+rev1;
		}
System.out.println("the revers of the sentence is :" + rev1);


	}

}
