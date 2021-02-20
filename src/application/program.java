package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(1, "Argemiro", "argemiro@gmail.com", new Date(), 2000.0, obj);
		System.out.println(seller);
	}
}
