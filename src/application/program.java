package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("********** TEST 1: seller find by **********");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		
		System.out.println("\n********** TEST 2: departament find by **********");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}	
		
		System.out.println("\n********** TEST 3: seller find all **********");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
			
		System.out.println("\n********** TEST 4: seller insert **********");
		Seller newSeller = new Seller(null, "Greg", "greg@gamil.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n********** TEST 5: seller update **********");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wine");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n********** TEST 6: seller delete **********");
		System.out.println("Enter id for delete teste: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
	}
}
