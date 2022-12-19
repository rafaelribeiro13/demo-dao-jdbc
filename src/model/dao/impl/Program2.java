package model.dao.impl;

import java.util.List;

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
		
		System.out.println();
		
		System.out.println("==== TEST 2: department findById ====");
		dep = depDao.findById(7);
		System.out.println(dep);
		
		System.out.println();
		
		System.out.println("==== TEST 3: department findAll ====");
		List<Department> list = depDao.findAll();
		list.forEach(dept -> System.out.println(dept));
		
	}
	
}
