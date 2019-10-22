package com.virtusa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.virtusa.dao.ManagerDAO;
import com.virtusa.entities.Interview;
import com.virtusa.entities.Manager;
import com.virtusa.entities.User;
import com.virtusa.factory.FactoryManagerDAO;
import com.virtusa.model.ManagerModel;
import com.virtusa.model.UserModel;


public class ManagerServiceImpl implements ManagerService {
    private ManagerDAO managerDAO=null;
  	public ManagerServiceImpl()
	{
    this.managerDAO=FactoryManagerDAO.createManagerDAO();
	}
	

	@Override
	public boolean storeApplicationService(ManagerModel managerModel) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public boolean scheduleInterviewService(ManagerModel managerModel) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Interview interview=new Interview();
		interview.setDate(managerModel.getDate());
		interview.setVenue(managerModel.getVenue());
		
		return managerDAO.scheduleInterview(interview);
	}

	@Override
	public List<ManagerModel> retrieveInterviewer() throws ClassNotFoundException, SQLException {
		User user=new User();
		List<User> userNameList=managerDAO.assignInterviewer();
		List<ManagerModel> userModelList=new ArrayList<ManagerModel>();
		for(User user1:userNameList){
			
			ManagerModel userMdl=new ManagerModel();
			userMdl.setUsername(user1.getUserName());
			userModelList.add(userMdl);
		}
		return userModelList;
	}

	
	@Override
	public List<ManagerModel>retrieveResultUpdate() throws ClassNotFoundException, SQLException
	{
		List<Manager> resultUpdateStatusList=managerDAO.viewResultUpdate();
		List<ManagerModel> managerModelList=new ArrayList<ManagerModel>();
		for(Manager manager:resultUpdateStatusList)
		{
			ManagerModel managerMdl=new ManagerModel();
			managerMdl.setResultUpdate(manager.getResultUpdate());
			managerModelList.add(managerMdl);
		}
		return managerModelList;
	}
	
	@Override
	public List<ManagerModel> retrieveApplicationService() {
		// TODO Auto-generated method stub
		return null;
	}

}
