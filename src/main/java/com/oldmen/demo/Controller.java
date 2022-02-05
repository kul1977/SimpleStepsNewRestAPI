package com.oldmen.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	List<employee> employees = new ArrayList<>(
			Arrays.asList(
						new employee(1001, "John", "4340 Virgil Street Port St Joe FL Flori"    ,"850-227-8539", 32456),
						new employee(1002, "Bob" , "1885 Fairfield Road Milwaukee WI Wisconsin" ,"262-586-3369", 53213)						
					));
	
	@RequestMapping("/employee")
	public List<employee> getAllEmployee() {
	    return employees;
	}
}
