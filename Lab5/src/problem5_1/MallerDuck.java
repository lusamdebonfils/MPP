package problem5_1;


public class MallerDuck extends Duck {

	@Override
	public
	void display() {
		System.out.println("	display");
	}

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
