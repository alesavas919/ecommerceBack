package xyz.testProject.xyz.restController;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.testProject.xyz.service.UsersService;

@RestController
@RequestMapping("user/")
public class UsersRestController  {
	
	@Autowired
	private UsersService usersService;
		
	@PostMapping("createUser")
	public ResponseEntity<?> createUser() {
		return ResponseEntity.ok(true);
	}
	
	@GetMapping("showInfo")
	public ResponseEntity<?> showInfo() {
		List<Object> data = Arrays.asList("hola","como","estas");
		return ResponseEntity.ok(data);
	}
	

}
