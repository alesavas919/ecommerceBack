package xyz.testProject.xyz.service;


import java.util.List;

import xyz.testProject.xyz.model.Product;

public interface ProductService {
	public Boolean createProduct(Product product);
	public List<Product> showProductByName(String name);
	public List<Product> showProductByDetails(String details);
	public List<Product> showProductByCustomFilter(String name,String details);
	
}
