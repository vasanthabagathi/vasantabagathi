package com.virtusa.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Interview;
import com.virtusa.entities.Manager;
import com.virtusa.entities.User;
import com.virtusa.integrate.ConnectionManager;
import com.virtusa.model.ManagerModel;
import com.virtusa.repository.ManagerRepository;

public class ManagerDAOImpl implements ManagerDAO {
	
	      private String interviewerId;
	       User user=new User();
	       @Override
	       public List<Manager> viewApplications() throws ClassNotFoundException, SQLException {
	   		// TODO Auto-generated method stub
	   		Connection connection=null;
	   			connection = ConnectionManager.openConnection();
	   			PreparedStatement statement=
	   					connection.prepareStatement("select resume from resume");
	   			ResultSet resultSet=
	   					statement.executeQuery();
	   			List<Manager> applicationsList=new ArrayList<Manager>();
	   			while(resultSet.next()) {
	   				Manager manager=new Manager();
	   				manager.setApplications(resultSet.getString(1));
	   				applicationsList.add(manager);
	   			}
	   		return applicationsList;
	   	}
	            private String localDate;
				public boolean scheduleInterview(Interview interview) throws ClassNotFoundException, SQLException {
						Connection conn =
								ConnectionManager.openConnection();
						PreparedStatement stm=conn.prepareStatement("insert into interview(date,venue) values(?,?)");
						stm.setDate(2, Date.valueOf(localDate));
						stm.setString(3, interview.getVenue());
						int rows=stm.executeUpdate();
						System.out.println("rows:"+rows);
						ConnectionManager.closeConnection();
						if(rows>0)
							return true;
						else
				            return false;
						}	
				
				public List<User> assignInterviewer() throws ClassNotFoundException, SQLException {
						// TODO Auto-generated method stub
						Connection connection=ConnectionManager.openConnection();
						PreparedStatement statement=connection.prepareStatement("select u.userName from users u join employee e on u.userId=e.userId and  designation='Ïnterviewer'");
						ResultSet resultSet=statement.executeQuery();
						List<User> userList=new ArrayList<>();
						while(resultSet.next()) { 
							
							user.setUserName(resultSet.getString("userName"));
							userList.add(user);
						}	
			  				ConnectionManager.closeConnection();
			  				
							return userList;
				}
				
					@Override
					public List<Manager> viewResultUpdate() throws ClassNotFoundException,SQLException
					{
						Connection connection=null;
						connection=ConnectionManager.openConnection();
						PreparedStatement statement=connection.prepareStatement("select resultUpdate from applicant");
						ResultSet resultSet=statement.executeQuery();
						List<Manager> resultUpdateList=new ArrayList<Manager>();
						while(resultSet.next()) 
						{
							Manager manager=new Manager();
							manager.setResultUpdate(resultSet.getString(1));
							resultUpdateList.add(manager);
						}
						return resultUpdateList;
					}


}
