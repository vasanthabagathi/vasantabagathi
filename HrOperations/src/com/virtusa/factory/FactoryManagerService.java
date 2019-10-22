package com.virtusa.factory;

import com.virtusa.service.ManagerService;
import com.virtusa.service.ManagerServiceImpl;

public class FactoryManagerService {

	public static ManagerService createManagerService(){
		
		ManagerService managerService=(ManagerService) new ManagerServiceImpl();
			return managerService;
		}
}
