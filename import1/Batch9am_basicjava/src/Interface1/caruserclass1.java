package Interface1;

public class caruserclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Honda obj1=new Honda();
		System.out.println("***************Honda**********");
				
		obj1.color();
		obj1.musicsystem();
		obj1.sunroof();
		obj1.tyres();
		obj1.lcdscreen();
		obj1.luggage();
		Honda.foglights();
		
		System.out.println("***************BMW**********");

				BMW obj2=new BMW();
				obj2.color();
				obj2.sunroof();
				obj2.musicsystem();
				obj2.tyres();
				obj2.lcdscreen();
				
		

	}

}
