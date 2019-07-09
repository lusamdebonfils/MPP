package problem3A;

public class Cylinder extends Circle {
	private double height = 1.0;
	
	public Cylinder() {
		super();
	}
	public Cylinder(double radius) {
		super(radius);
	}
	public Cylinder(double radius, double height) {
		this(radius);
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return Math.PI * this.getRadius() * this.getRadius() * height;
	}
}