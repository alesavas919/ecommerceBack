package xyz.testProject.xyz.service;


import java.util.List;

import xyz.testProject.xyz.model.Orders;

public interface OrdersService {
	public Boolean createOrders(Orders order);
	public Boolean removeOrders(Orders order);
	public Boolean payOrders(Orders order);
	public List<Orders> showMyCustomerOrders(String customerId);
	public List<Orders> showMySalesOrders(String sellerId);
}
