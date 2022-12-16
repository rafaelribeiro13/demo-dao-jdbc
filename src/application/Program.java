package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TEST 1: seller findById ====");
		Seller sel1 = sellerDao.findById(3);
		System.out.println(sel1);
		
		System.out.println();
		
		System.out.println("==== TEST 2: seller findByDepartment ====");
		List<Seller> list = sellerDao.findByDepartment(new Department(4, null));
		list.forEach(x -> System.out.println(x));

		System.out.println();
		
		System.out.println("==== TEST 3: seller findAll ====");
		list = sellerDao.findAll();
		list.forEach(x -> System.out.println(x));
		
		System.out.println();
		
		System.out.println("==== TEST 4: seller insert ====");
		Seller sel2 = new Seller(null, "Clara", "clara@gmail.com", new Date(), 2500.00, new Department(3, null));
		sellerDao.insert(sel2);
		System.out.println("Inserted! new id = " + sel2.getId());
	}
	
}
