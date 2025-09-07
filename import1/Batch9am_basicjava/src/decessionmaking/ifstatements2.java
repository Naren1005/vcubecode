package decessionmaking;

import java.util.Scanner;

public class ifstatements2
{

public static void main(String[] args)
{

//boolean examStatus = false ;
	Scanner obj1=new Scanner(System.in);

	

int x=5;
int y=20;
int z=21;

if(x>y)
{

System.out.println("x is greater than y");
if (y>z)
{
	System.out.println("y is greater than z");
}

else
{
	System.out.println("z is greater than y ");
}
}
else 
{
	System.out.println("x is less than y and z");}
}

}