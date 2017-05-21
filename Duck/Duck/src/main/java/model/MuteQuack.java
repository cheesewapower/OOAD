package model;



public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("this duck can't quack");
		
	}

}
