package xyz.testProject.xyz.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import xyz.testProject.xyz.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
	
}
