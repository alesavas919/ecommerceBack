package xyz.testProject.xyz.service;


import xyz.testProject.xyz.model.Users;

public interface UsersService {
	public Boolean createUser(String name,String email,String password,String company_name,String location,String city,String country,String address,String cellphone,String details);
	public Users findUser(String name);
}
