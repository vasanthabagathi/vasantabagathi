package com.virtusa.dao;

import java.io.IOException;
import java.sql.SQLException;

public interface UserDAO {
  
	public boolean userAuth(String userName,String password) throws ClassNotFoundException, SQLException, IOException;
	public String retrieveUserType(String userName);
	
}
