package problem2;

import java.util.ArrayList;
import java.util.List;

public class LandLord {
	private List<Building> buildings;
	private double totalProfit = 0.0;
	private String name;
	private static final String line = "-----------------------------------------";
	
	public LandLord(String name) {
		this.setName(name);
		buildings = new ArrayList<>();
	}
	
	public void addBuilding(Building building) {
		buildings.add(building);
	}
	
	public double getTotalProfit() {
		buildings.forEach((e)->{
			totalProfit += e.getProfit();
		});
		return totalProfit;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printDetailedReport() {
		System.out.println(getName() +"'s buildings\n"+line);
		buildings.forEach((building)->{
			System.out.println("Building name: "+building.getName()+"\n"+line);
			System.out.println("Apartments Details(ID and Rent)");
			System.out.println("ID\tRent");
			building.getApartments().forEach((apartment)->{
				System.out.println(apartment.getId()+"\t"+apartment.getRent());
			});
			System.out.println(
					"Total Rent : "+building.calculateTotalRent()+
					"\tMaintenance cost : "+building.getMaintananceCost()+
					"\tBuilding profit : "+building.getProfit()+"\n"+line+line
								);
			
		});
			System.out.println("\t\t\t\t\t\tTotal LandLord Profit : "+getTotalProfit());
	}
	
}