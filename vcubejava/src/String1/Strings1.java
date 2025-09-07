package String1;
import java.util.Arrays;

public class Strings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Naren";
		String ab= new String();
		ab="narendra";
		int i =1234;
		String s3= new String("  Naren");
		String s4= "   hellow world how are you doing    ";
		System.out.println("with out object" + a);
		System.out.println("with object" + ab);
		System.out.println("with in object as a perameter " + s3);
		System.out.println("Converterd to lower case: " + s3.toLowerCase());
		System.out.println("Converterd to upper case: " + s3.toUpperCase());
		System.out.println("cnoverted from int to string  : "+ String.valueOf(i));
		System.out.println("checking starts with  -"  +  a.startsWith("N"));
		System.out.println("checking ends with  -"  +  a.endsWith("n"));
		System.out.println("finding the length : "+s3.length());
		System.out.println("using contains : " +s4.contains("ello"));
		System.out.println("checking ignore case " +a.equalsIgnoreCase(s3.trim()));
		
		System.out.println("checking the index of a string : " +s4.indexOf("world"));
		
		System.out.println("checking the index of a char : " +a.indexOf('a'));
		System.out.println(a.length());
		
		System.out.println("checking the substring : "+ s4.substring(10,18));
		
		System.out.println("splitting using the space :" + Arrays.toString(s4.split(" ")));
		
	}

}
