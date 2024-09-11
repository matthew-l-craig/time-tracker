package software.transparent.timetracker;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Task {

	private Date startTime = new Date();
	private Date endTime;
	private Map<String, String> attributes = new HashMap<String, String>();
	
	public Date getStart() {
		
		return startTime;
		
	}
	
	public Date getEnd() {
		
		if(endTime == null) {
			endTime = new Date();
		}
		return endTime;
		
	}
	
	public void addAttribute(String key, String value) {
		
		attributes.put(key, value);
		
	}
	
}
