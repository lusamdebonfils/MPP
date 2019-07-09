package problem5_1;

public abstract class Duck {
	
	public void display(){
		System.out.println("	displaying");
	}
	
	public abstract void fly();
	public abstract void quack(); 

	public void swim() {
		System.out.println("	Swimming");
	}
	
	
	

}