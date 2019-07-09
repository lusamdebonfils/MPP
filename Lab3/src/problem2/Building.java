package problem2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Building {
	
	private HashMap<String,Double> maintananceCosts;
	private double totalCost;
	private List<Apartment> apartments;
	private LandLord landLord;
	private String name;
	private double profit;
	private double totalRent;
	
	public Building(String name, LandLord landLord) {
		this.name = name;
		this.landLord = landLord;
		maintananceCosts = new HashMap<>();
		profit = 0;
		totalRent = 0;
		totalCost = 0;
		apartments = new ArrayList<>();
	}

	public List<Apartment> getApartments() {
		return apartments;
	}

	public void addApartment(String id, double rent) {
		Apartment n = new Apartment(id, this, rent);
		apartments.add(n);
	}
	public void addApartment(Apartment apartment) {
		apartments.add(apartment);
	}

	public LandLord getLandLord() {
		return landLord;
	}

	public void setLandLord(LandLord landLord) {
		this.landLord = landLord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaintananceCost() {
		maintananceCosts.forEach((key,value)->{
			totalCost += value;
		});
		return totalCost;
	}

	public void addMaintananceCost(String costName,double costAmount) {
		maintananceCosts.put(costName,costAmount);
	}

	public double getProfit() {
		profit = calculateTotalRent() - getMaintananceCost();
		return profit;
	}
	public double calculateTotalRent() {
		apartments.forEach((e)->{
			totalRent += e.getRent();
		});
		return totalRent;
	}
	
}
