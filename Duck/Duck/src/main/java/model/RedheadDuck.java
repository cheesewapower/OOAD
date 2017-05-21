package model;

public class RedheadDuck extends Duck{
	public RedheadDuck() {
	      quackBehavior = new Squeak();
	      flyBehavior = new FlyWithWings();
	   }
	   public void display() {
		   System.out.println("-----------RedheadDuck----------");
	   }
}
