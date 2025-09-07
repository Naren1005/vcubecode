package parallelpack;

import org.testng.annotations.Test;

public class parallelclass1 {
  @Test
  public void add() throws InterruptedException {
	  Thread.sleep(2000);
	  System.out.println("the thread id is :"+Thread.currentThread().getId());
	  int x=10;
	  int y=20;
	  System.out.println("the sum of x and y are:  "+ (x+y));
  }
  @Test
  public void divide() throws InterruptedException {
	  Thread.sleep(3000);
	  int x=10;
	  int y=20;
	  System.out.println("the thread id is :"+Thread.currentThread().getId());
	  System.out.println("the division of x and y are:  "+ x/y);
  }
  @Test
  public void mul() throws InterruptedException {
	  Thread.sleep(5000);
	  int x=10;
	  int y=20;
	  System.out.println("the thread id is :"+Thread.currentThread().getId());
	  System.out.println("the multiplication of x and y are:  "+ x*y);
  }
}
