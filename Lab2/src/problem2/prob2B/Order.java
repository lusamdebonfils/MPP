package problem2.prob2B;

import java.util.HashMap;


public class Order {
	
	private int orderNum;
	private HashMap<OrderLine, Integer> orderLines;
	private double total = 0.0;
	private double subTotal = 0.0;
	
	public Order(int orderNum) {
		this.orderNum = orderNum;
		this.orderLines = new HashMap<>();;
	}

	public int getOrderNum() {
		return orderNum;
	}


	public void addOrderLine(String name, Double basePrice, int quantity) {
		OrderLine ord = new OrderLine(this,name,basePrice);
		orderLines.put(ord, quantity);
	}

	public void getTotalCost() {
		System.out.println("\nOrder Details\n---------------------- ");
		orderLines.forEach((key,value)->{
			subTotal = 0.0;
			subTotal += key.getBasePrice()*value;
			total += subTotal;
			System.out.println(key.getOrderLineName()+"\t: "+ subTotal);
		});
		System.out.println("Total Cost is\t: "+total);
		
	}
	
	
}