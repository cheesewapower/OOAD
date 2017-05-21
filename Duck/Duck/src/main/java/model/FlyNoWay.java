package model;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("this duck can't fly");
		
	}

}
