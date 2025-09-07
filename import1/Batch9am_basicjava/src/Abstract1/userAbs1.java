package Abstract1;

public class userAbs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int2 obj1= new Hondaabs1();
		System.out.println("**************Honda*************");
		
		obj1.color();
		obj1.musicsystem();
		obj1.lcdscreen();
		//obj1.foglight();
		
		
		BMWabs1 obj2=new BMWabs1();
		System.out.println("**************BMW*************");
		obj2.color();
		obj2.lcdscreen();
		obj2.musicsystem();
		obj2.trailer();
		
	
		

	}

}
