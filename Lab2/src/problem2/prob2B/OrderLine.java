package problem2.prob2B;

public class OrderLine {
	
	private Order order;
	private Double basePrice;
	private String OrderLineName;
	
	
	public OrderLine(Order order,String name, Double price) {
		this.order = order;
		this.basePrice = price;
		this.OrderLineName = name;	
	}
	
	public OrderLine(Order order) {
		this(order,null,0.0);
	}
	
	public Double getBasePrice() {
		return basePrice;
	}

	public String getOrderLineName() {
		return OrderLineName;
	}
	
	public void setOrderLineProps(String name, Double price) {
		OrderLineName = name;
		basePrice = price;
	}
	
	
}
