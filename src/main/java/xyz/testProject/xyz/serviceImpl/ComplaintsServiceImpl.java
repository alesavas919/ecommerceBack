package xyz.testProject.xyz.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.testProject.xyz.model.Complaints;
import xyz.testProject.xyz.model.Users;
import xyz.testProject.xyz.repository.ComplaintsRepository;
import xyz.testProject.xyz.service.ComplaintsService;

@Service
public class ComplaintsServiceImpl implements ComplaintsService {

	@Autowired
	private ComplaintsRepository complaintsRepository;
	
	@Override
	public Boolean createComplaint(Complaints complaints) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Complaints> findMyComplaintsBySeller(Users customer, Users seller) {
		// TODO Auto-generated method stub
		return null;
	}

}
