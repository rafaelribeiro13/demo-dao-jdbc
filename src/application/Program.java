package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department d1 = new Department(1, "Books");
		Seller seller = new Seller(1, "Clara", "clara@gmail.com", new Date(), 3000.00, d1);

		System.out.println(seller);
	
	}
	
}
