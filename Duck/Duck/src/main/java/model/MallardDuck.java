package model;

public class MallardDuck extends Duck {
	   public MallardDuck() {
	      quackBehavior = new Quack();
	      flyBehavior = new FlyWithRocket();
	   }
	   public void display() {
		   System.out.println("-----------MallarDuck----------");
	   }
	}

