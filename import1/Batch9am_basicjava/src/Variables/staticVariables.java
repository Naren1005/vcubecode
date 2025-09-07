package Variables;

public class staticVariables {
	
	static int c=10;
	int a=1;
	int d;
	void add()
	{
		d=a+c;
		System.out.println("accesed the statci variable in side the non static function-"+d);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticVariables obj1=new staticVariables();
		obj1.add();
		System.out.println("able to access the static varibale-"+c);
		

	}

}
