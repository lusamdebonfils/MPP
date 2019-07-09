package problem3A;

public class Circle {
	
	private double radius = 1.0;
	private String color = "red";
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getClass().getSimpleName());
		sb.append(" : ");
		sb.append("color["+ color+"]"+", radius ["+ radius +"]");
		return sb.toString();
	}
}
