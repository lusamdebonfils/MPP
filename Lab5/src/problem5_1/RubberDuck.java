package problem5_1;

public class RubberDuck extends Duck {

	@Override
	public void quack() {
		QuackBehavior a = new Squeak();
		a.quack();
		
	}

	@Override
	public void fly() {
		FlyBehavior a = new CanNotFly();
		a.fly();		
	}
	
}