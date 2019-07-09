package problem5_1;

public class DecoyDuck extends Duck {

	@Override
	public void quack() {
		QuackBehavior a = new MuteQuack();
		a.quack();
		
	}

	@Override
	public void fly() {
		FlyBehavior a = new CanNotFly();
		a.fly();
		
	}

	

}
