package problem2.prob2B;

public class Main {

	public static void main(String[] args) {
		Order myOrder = new Order(100);
		myOrder.addOrderLine("Fish", 20000.0, 10);
		myOrder.addOrderLine("Beer", 10000.0, 100);
		myOrder.addOrderLine("Chicken", 30000.0, 50);
		
		myOrder.getTotalCost();

	}

}
