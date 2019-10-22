package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;
import com.virtusa.entities.Interview;
import com.virtusa.entities.Interviewer;
import com.virtusa.entities.Manager;
import com.virtusa.entities.User;

public interface ManagerDAO {
	public List<User> assignInterviewer() throws ClassNotFoundException, SQLException;
	//public List<Manager> viewApplications();
	//public List<Interview> getInterviewerDetails() throws ClassNotFoundException, SQLException;
	public List<Manager> viewResultUpdate() throws ClassNotFoundException, SQLException;
	public boolean scheduleInterview(Interview interview) throws ClassNotFoundException, SQLException;
	List<Manager> viewApplications() throws ClassNotFoundException, SQLException;
}
