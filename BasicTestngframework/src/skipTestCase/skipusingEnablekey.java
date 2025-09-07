package skipTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class skipusingEnablekey {
 
  @Test
  public void hrs() {
	  String name="Horse";
	  
	  Assert.assertEquals(name, "Horse");;
	  System.out.println("The correct name of the animal is :"+ name);  
  }
  
  @Test
  public void ca1() {
	  String name="Cat";
	  
	  Assert.assertEquals(name, "Cat");
	  System.out.println("The correct name of the animal is :"+ name);
  }
  @Test (enabled = false) //************* this test case will be ignored from execution.
  public void ln1() {
	  String name="Lion";
	  
	  Assert.assertEquals(name, "Lion");
	  System.out.println("The correct name of the animal is :"+ name);
  }
  
  @Test
  public void ltin1() {
	  String name="Tiger";
	  
	  Assert.assertEquals(name, "Tiger");
	  System.out.println("The correct name of the animal is :"+ name);
  }
  
  @Test
  public void ch1() {
	  String name="Chita";
	  
	  Assert.assertEquals(name, "Chita");
	  System.out.println("The correct name of the animal is :"+ name);
  }
  
  @Test
  public void to1() {
	  String name="Tortoise";
	  
	  Assert.assertEquals(name, "Tortoise");
	  System.out.println("The correct name of the animal is :"+ name);
  }
  
  @Test
  public void sh1() {
	  String name="Sheep";
	  
	  Assert.assertEquals(name, "Sheep");
	  System.out.println("The correct name of the animal is :"+ name);
  }
  
  @Test
  public void bk1() {
	  String name="Donkey";
	  
	  Assert.assertEquals(name, "Donkey");
	  
	  System.out.println("The correct name of the animal is :"+ name);
  }
  @Test
  public void mo1() {
	  String name="Monkey";
	  
	  Assert.assertEquals(name, "Monkey");
	  
	  System.out.println("The correct name of the animal is :"+ name);
  }
  @Test
  public void be1() {
	  String name="Bear";
	  
	  Assert.assertEquals(name, "Bear");
	  
	  System.out.println("The correct name of the animal is :"+ name);
  }
  @Test
  public void el1() {
	  String name="Elephant";
	  
	  Assert.assertEquals(name, "Elephant");
	  
	  System.out.println("The correct name of the animal is :"+ name);
  }
  
  @Test
  public void fr1() {
	  String name="Frog";
	  
	  Assert.assertEquals(name, "Frog");
	  
	  System.out.println("The correct name of the animal is :"+ name);
  }
  @Test
  public void cr1() {
	  String name="Crocodile";
	  
	  Assert.assertEquals(name, "Crocodile");
	  
	  System.out.println("The correct name of the animal is :"+ name);
  }
  @Test
  public void jr1() {
	  String name="Jaguar";
	  
	  Assert.assertEquals(name, "Jaguar");
	  
	  System.out.println("The correct name of the animal is :"+ name);
  }
  
  @Test
  public void dg1() {
	  String name="Dog";
	  
	  Assert.assertEquals(name, "Dog");
	  
	  System.out.println("The correct name of the animal is :"+ name);
  }
  @Test
  public void hm1() {
	  String name="Humanbeing";
	  
	  Assert.assertEquals(name, "Humanbeing");
	  
	  System.out.println("The correct name of the animal is :"+ name);
  }
}
