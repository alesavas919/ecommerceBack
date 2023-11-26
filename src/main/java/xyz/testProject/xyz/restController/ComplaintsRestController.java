package xyz.testProject.xyz.restController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.testProject.xyz.service.ComplaintsService;

@RestController
@RequestMapping("complaints/")
public class ComplaintsRestController {

	@Autowired
	private ComplaintsService complaintsService;
	
	
}
