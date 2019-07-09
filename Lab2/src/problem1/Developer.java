package problem1;

public class Developer {
	
	private String name;
	private String id;
	//private Sprint currentSprint;
	
	public Developer() {
		this(null, null);
	}
	
	public Developer(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
}
