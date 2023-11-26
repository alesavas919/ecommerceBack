package xyz.testProject.xyz.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.testProject.xyz.model.History;
import xyz.testProject.xyz.model.Orders;
import xyz.testProject.xyz.repository.HistoryRepository;
import xyz.testProject.xyz.service.HistoryService;
@Service
public class HistoryServiceImpl implements HistoryService {

	@Autowired
	private HistoryRepository historyRepository;
	
	@Override
	public void saveMyProductInfo(Orders orders) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<History> showMyHistory(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
