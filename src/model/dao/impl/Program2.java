package model.dao.impl;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		System.out.println("==== TEST 1: department insert ====");
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		Department dep = new Department(null, "IT");
		depDao.insert(dep);
		System.out.println("Inserted! new id = " + dep.getId());
		
		
	}
	
}
