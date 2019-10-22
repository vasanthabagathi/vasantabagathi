package com.virtusa.repository;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Applicant;
import com.virtusa.entities.Manager;

public class ManagerRepository {

private static List<Manager> applications=new ArrayList<Manager>();
	
	public static List<Manager> get(){
	return applications;
}
}
