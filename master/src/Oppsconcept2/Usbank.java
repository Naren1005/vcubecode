package Oppsconcept2;

public interface Usbank {
	
	/*-only method declaration.
-no method body- only prototype.
-In interface we can declare variables, and they are static in nature.
-Variable value will not be changed.
-no static method in interface.
- we can’t create object of interface.
-interface is abstract in nature.
*/
	int min_bal=100;
	
	public void credit();
	
	public void transfer();
	
	public void debit();

}
