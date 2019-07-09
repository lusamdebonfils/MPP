package problem2;

public class Apartment {
	
	private String id;
	private double rent;
	private Building building;
	
	public Apartment(String id, Building building, double rentAmount) {
		this.building = building;
		this.id = id;
		this.setRent(rentAmount);
	}

	public String getId() {
		return id;
	}
	
	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public Building getBuilding() {
		return building;
	}
	
}
