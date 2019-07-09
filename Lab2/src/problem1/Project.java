package problem1;

import java.util.ArrayList;
import java.util.List;

public class Project {
	private boolean isCompleted;
	private String projectId;
	private String projectName;
	private List<Feature> backLog;
	private List<Feature> completedFeatures;
	private List<Release> releases;
	private ProjectManager manager;
	
	public Project(String projectId, String projectName) {
		this.projectId = projectId;
		this.projectName = projectName;
		backLog = new ArrayList<>();
		completedFeatures = new ArrayList<>();
		releases = new ArrayList<>();
		manager = new ProjectManager();
		isCompleted = false;
		
	}
	
	public boolean isCompleted() {
		isCompleted = backLog.isEmpty();
		return isCompleted;
	}
	public String getProjectId() {
		return projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public List<Feature> getBackLog() {
		return backLog;
	}
	public List<Feature> getcompletedFeatures() {
		return completedFeatures;
	}
	//add Features to completed List
	
	
	public void setBackLog(List<Feature> backLog) {
		this.backLog = backLog;
	}
	public List<Release> getReleases() {
		return releases;
	}
	public void setReleases(List<Release> releases) {
		this.releases = releases;
	}
	public ProjectManager getManager() {
		return manager;
	}
	public void setManager(ProjectManager manager) {
		this.manager = manager;
	}
	//Other methods
	
	
	
	
}
