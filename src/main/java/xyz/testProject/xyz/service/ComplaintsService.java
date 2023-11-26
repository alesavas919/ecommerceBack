package xyz.testProject.xyz.service;


import java.util.List;

import xyz.testProject.xyz.model.Complaints;
import xyz.testProject.xyz.model.Users;

public interface ComplaintsService  {
	public Boolean createComplaint(Complaints complaints);
	public List<Complaints> findMyComplaintsBySeller(Users customer,Users seller);
}
