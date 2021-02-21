package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("********** TEST 1: seller find by **********");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
	}
}
