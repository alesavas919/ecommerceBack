package xyz.testProject.xyz.restController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.testProject.xyz.service.OrdersService;

@RestController
@RequestMapping("orders/")
public class OrdersRestController {

	@Autowired
	private OrdersService ordersService;
}
