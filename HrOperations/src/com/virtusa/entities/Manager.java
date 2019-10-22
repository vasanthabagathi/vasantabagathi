package com.virtusa.entities;

import com.virtusa.model.ManagerModel;

public class Manager extends User{
	
public Manager() {
		
	}
private Job job;
public Job getJob() {
	return job;
}
public void setJob(Job job) {
	this.job = job;
}
	private String managerId;
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + "]";
	}
	public void setResultUpdate(String string) {
		// TODO Auto-generated method stub
		
	}
	public String getResultUpdate() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setApplications(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}
package com.virtusa.entities;

public class Manager {

}
