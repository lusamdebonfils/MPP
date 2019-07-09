package problem1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ProjectManager {
	
	private String name;
	private String id;
	private Map<Developer, Integer> progressTracker;
	
	public ProjectManager(String id, String name) {
		this.id = id;
		this.name = name;
		progressTracker = new HashMap<>();
	}
	public ProjectManager() {
		this(null, null);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	private LocalDate getCurrentDate() {
		return LocalDate.now();
		
	}
	
	public void getProgressReport() {
		progressTracker.forEach(
				(k,v)->{
					//print each report for Developer on a particular date;
				});
	}
	
//	private getReport() {
//		
//	}

}
