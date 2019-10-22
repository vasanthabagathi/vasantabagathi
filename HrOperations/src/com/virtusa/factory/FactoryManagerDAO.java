package com.virtusa.factory;

import com.virtusa.dao.ManagerDAO;
import com.virtusa.dao.ManagerDAOImpl;

public class FactoryManagerDAO {
        public static ManagerDAO createManagerDAO(){
		ManagerDAO managerDAO=new ManagerDAOImpl();
		return managerDAO;
		}
}
