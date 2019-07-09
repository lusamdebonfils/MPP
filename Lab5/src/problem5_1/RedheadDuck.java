package problem5_1;

public class RedheadDuck extends Duck {

	@Override
	public void quack() {
		QuackBehavior a = new Quack();
		a.quack();
		
	}

	@Override
	public void fly() {
		FlyBehavior a = new FlyWithWings();
		a.fly();
	}



}
