package delta.engine.dao;

import java.util.ArrayList;
import java.util.List;

import delta.engine.model.Product;

public class ProductStore {
	private static List<Product> products=new ArrayList<>();
	
	private ProductStore() {
		
	}
	
	
	static {
		Product laptop=new Product(10,"Laptop",150.00);
		Product cellphone=new Product(11,"Cellphone",100.00);
		Product car=new Product(12,"car",4000.00);
		Product TV=new Product(13,"TV",160.00);
		Product refrigerator=new Product(14,"Refrigerator",350.00);
		
		products.add(laptop);
		products.add(cellphone);
		products.add(car);
		products.add(TV);
		products.add(refrigerator);
	}
	
	public static List<Product> loadProducts(){
		return products;
	}

}
