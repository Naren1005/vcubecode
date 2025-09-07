package Annotationpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class anotationImple {
  @Test
  public void dt() {
	  System.out.println("i am default test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am beforeMethod");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am beforeTest");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am afterClass");
  }

  
  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am afterSuite");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("i am afterTest");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am afterMethod");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am beforeSuite");
  }

  

}
