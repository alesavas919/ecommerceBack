package xyz.testProject.xyz.restController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.testProject.xyz.service.HistoryService;

@RestController
@RequestMapping("history/")
public class HistoryRestController {
	
	@Autowired
	private HistoryService historyService;
}
