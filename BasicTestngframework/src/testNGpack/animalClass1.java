package testNGpack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class animalClass1 {
  @Test
  public void hrs() {
	  String name="Horse";
	  
	 
	  if(name=="Horse") {
		  System.out.println("Correct animal name is :"+ name);
	  }
	  else                                                            // this is not the correct to validate the test condition 
	  																	//we should use assertion Assert.assertEquals(name, "Horse");;
	  {
		  System.out.println("incorrect animal name");
	  }
	  
  }
  
  @Test
  public void ca() {
	  String name="Cat";
	  
	  if(name=="Cat") {
		  System.out.println("Correct animal name is :"+ name);
	  }
	  else
	  {
		  System.out.println("incorrect animal name");
	  }
	  
  }
  @Test
  public void ln() {
	  String name="Lion";
	  
	  if(name=="lion") {
		  System.out.println("Correct animal name is :"+ name);
	  }
	  else
	  {
		  System.out.println("incorrect animal name");
	  }
	  
  }
}
