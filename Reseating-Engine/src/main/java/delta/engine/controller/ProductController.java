package delta.engine.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import delta.engine.dao.ProductStore;
import delta.engine.model.Product;

@RestController
public class ProductController {
	
	
	@RequestMapping("/products")
	//@ResponseBody
	public List<Product> getProducts(){
		System.out.println("Printing list of products...");
		return ProductStore.loadProducts();
	}

	@RequestMapping("/hi")
	public String hi() {
		System.out.println("Hi");
		return "hello";
	}
}
