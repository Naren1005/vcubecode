package Oppsconcept2;

import java.util.ArrayList;

//import java.util.ArrayList;

public class Testinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Usbank.min_bal);
		
		
		
	Hsbcbank hs=new Hsbcbank();
	hs.credit();
	hs.carloan();
	hs.homeloan();
	hs.debit();
	hs.transfer();
	hs.mutalfunds();
	
	System.out.println("***********");
	Usbank ref=new Hsbcbank();
	Brazilbank ref1=new Hsbcbank();
	
	//dynamic polymorphysim 
	ref.credit();
	ref.debit();
	ref.transfer();
	ref1.mutalfunds();
	

	}

}
