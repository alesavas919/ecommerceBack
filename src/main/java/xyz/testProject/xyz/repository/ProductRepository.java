package xyz.testProject.xyz.repository;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import xyz.testProject.xyz.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	List<Product> findAll(Pageable pageable);
	
	
}
