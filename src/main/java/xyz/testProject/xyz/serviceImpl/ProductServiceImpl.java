package xyz.testProject.xyz.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.testProject.xyz.model.Product;
import xyz.testProject.xyz.repository.ProductRepository;
import xyz.testProject.xyz.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Boolean createProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> showProductByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> showProductByDetails(String details) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> showProductByCustomFilter(String name, String details) {
		// TODO Auto-generated method stub
		return null;
	}

}
