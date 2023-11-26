package xyz.testProject.xyz.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.testProject.xyz.model.Orders;
import xyz.testProject.xyz.repository.OrdersRepository;
import xyz.testProject.xyz.service.OrdersService;
@Service
public class OrdersServiceImpl implements OrdersService{

	@Autowired
	private OrdersRepository ordersRepository;
	
	@Override
	public Boolean createOrders(Orders order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean removeOrders(Orders order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean payOrders(Orders order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> showMyCustomerOrders(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> showMySalesOrders(String sellerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
