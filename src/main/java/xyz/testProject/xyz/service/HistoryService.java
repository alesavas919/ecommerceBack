package xyz.testProject.xyz.service;


import java.util.List;

import xyz.testProject.xyz.model.History;
import xyz.testProject.xyz.model.Orders;

public interface HistoryService {
	public void saveMyProductInfo(Orders orders);
	public List<History> showMyHistory(String username);
}
