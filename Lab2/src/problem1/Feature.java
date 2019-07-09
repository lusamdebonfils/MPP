package problem1;

public class Feature {
	private String featureName;
	private String featureId;
	private boolean isComplete;
	
	public Feature(String id, String name) {
		featureId = id;
		featureName = name;
		isComplete = false;
	}

	public String getFeatureName() {
		return featureName;
	}

	public String getFeatureId() {
		return featureId;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	
	
	
}
