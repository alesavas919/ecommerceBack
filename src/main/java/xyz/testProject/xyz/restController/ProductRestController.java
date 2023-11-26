package xyz.testProject.xyz.restController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.testProject.xyz.service.ProductService;

@RestController
@RequestMapping("product/")
public class ProductRestController {
	
	@Autowired
	private ProductService productService;
}
