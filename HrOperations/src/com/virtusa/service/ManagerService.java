package com.virtusa.service;

import java.sql.SQLException;
import java.util.List;
import com.virtusa.model.ManagerModel;
import com.virtusa.model.UserModel;

public interface ManagerService {

	public List<ManagerModel> retrieveApplicationService();
	public boolean scheduleInterviewService(ManagerModel managerModel) throws ClassNotFoundException, SQLException;
	public List<ManagerModel>  retrieveInterviewer() throws ClassNotFoundException, SQLException;
	boolean storeApplicationService(ManagerModel managerModel);
	public static List<ManagerModel> retrieveResultUpdate() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
