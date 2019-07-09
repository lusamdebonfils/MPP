package prob2;

public interface Polygon {
	
	 double[] getSides();
	 
	 default double computePerimeter() {
		double perimeter = 0;
		double[] sides = getSides();
		for(double side : sides) {
			perimeter += side;
		}
		return perimeter;
	 }
}
