package problem2;

public class Main {

	public static void main(String[] args) {
		//LandLord1
		LandLord landLord1 = new LandLord("Samuel Luswata");
		//Building 140
		Building b140 = new Building("B140", landLord1);
		Apartment b140_001 = new Apartment("001",b140,7000);
		Apartment b140_002 = new Apartment("002",b140,9000);
		Apartment b140_003 = new Apartment("003",b140,8000);
		Apartment b140_004 = new Apartment("004",b140,5000);
		b140.addApartment(b140_001);
		b140.addApartment(b140_002);
		b140.addApartment(b140_003);
		b140.addApartment(b140_004);
		
		//Building 141
		Building b141 = new Building("B141", landLord1);
		Apartment b141_001 = new Apartment("001",b141,2000);
		Apartment b141_002 = new Apartment("002",b141,3000);
		Apartment b141_003 = new Apartment("004",b141,2000);
		Apartment b141_004 = new Apartment("005",b141,3000);
		Apartment b141_005 = new Apartment("006",b141,2000);
		Apartment b141_006 = new Apartment("007",b141,3000);
		b141.addApartment(b141_001);
		b141.addApartment(b141_002);
		b141.addApartment(b141_003);
		b141.addApartment(b141_004);
		b141.addApartment(b141_005);
		b141.addApartment(b141_006);
		
		//Building 142
		Building b142 = new Building("B142", landLord1);
		Apartment b142_001 = new Apartment("001",b142,2000);
		Apartment b142_002 = new Apartment("002",b142,13000);
		Apartment b142_003 = new Apartment("004",b142,12000);
		Apartment b142_004 = new Apartment("005",b142,13000);
		Apartment b142_005 = new Apartment("006",b142,12000);
		Apartment b142_006 = new Apartment("007",b142,53000);
		Apartment b142_007 = new Apartment("008",b142,13000);
		Apartment b142_008 = new Apartment("009",b142,12000);
		Apartment b142_009 = new Apartment("010",b142,83000);
		b142.addApartment(b142_001);
		b142.addApartment(b142_002);
		b142.addApartment(b142_003);
		b142.addApartment(b142_004);
		b142.addApartment(b142_005);
		b142.addApartment(b142_006);
		b142.addApartment(b142_007);
		b142.addApartment(b142_008);
		b142.addApartment(b142_009);
		
		//Building 143
		Building b143 = new Building("B143", landLord1);
		Apartment b143_001 = new Apartment("001",b143,200);
		b143.addApartment(b143_001);
		
		//Adding Maintenance costs to Buildings
		b140.addMaintananceCost("Gardening", 800);
		b140.addMaintananceCost("Yaka", 1500);
		b140.addMaintananceCost("Umeme", 900);
		b140.addMaintananceCost("Gardening", 800);
		b140.addMaintananceCost("Garbage", 1500);
		b140.addMaintananceCost("Pool Cleaning", 900);
		
		b141.addMaintananceCost("Gardening", 800);
		b141.addMaintananceCost("Yaka", 1500);
		b141.addMaintananceCost("Umeme", 900);
		
		b142.addMaintananceCost("Gardening", 800);
		b142.addMaintananceCost("Garbage", 1500);
		b142.addMaintananceCost("Pool Cleaning", 900);
		
		b143.addMaintananceCost("Slashing", 10);
		landLord1.addBuilding(b140);
		landLord1.addBuilding(b141);
		landLord1.addBuilding(b142);
		landLord1.addBuilding(b143);
		landLord1.printDetailedReport();
		

	}

}