package xyz.testProject.xyz.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.testProject.xyz.model.Users;
import xyz.testProject.xyz.repository.UsersRepository;
import xyz.testProject.xyz.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public Boolean createUser(String name, String email, String password, String company_name, String location,
			String city, String country, String address, String cellphone, String details) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users findUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
