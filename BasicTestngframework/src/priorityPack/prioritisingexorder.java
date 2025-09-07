package priorityPack;

import org.testng.annotations.Test;

public class prioritisingexorder {
  @Test (priority=5)
  public void Goat() {
	  System.out.println(" I am Goat method : priority-0");
  }
  @Test (priority=85)
  public void pig() {
	  System.out.println(" I am pig method : priority-85");
  }
  @Test 
  public void Cat() {
	  System.out.println(" I am Cat method : no priority");
  }
  @Test (priority=25)
  public void dog() {
	  System.out.println(" I am dog method : priority-25");
  }
  @Test (priority=9)
  public void Duck() {
	  System.out.println(" I am Duck method : priority-9");
  }
  @Test
  public void donkey() {
	  System.out.println(" I am donkey method : no priority");
  }
  @Test (priority=1)
  public void horse() {
	  System.out.println(" I am horse method : priority-1");
  }
  @Test(priority=6)
  public void Monkey() {
	  System.out.println(" I am Monkey method : priority-6");
  }
  @Test
  public void crocodile() {
	  System.out.println(" I am crocodile method : no priority");
  }
  @Test (priority=-5)
  public void Rabbit() {
	  System.out.println(" I am Rabbit method : priority- -5");
  }
  @Test
  public void rat() {
	  System.out.println(" I am rat method : no priority");
  }
  @Test
  public void run() {
	  System.out.println(" I am run method : no priority");
  }
}
