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
						new employee(1001, "John"),
						new employee(1002, "Bob")
					));
	
	@RequestMapping("/employee")
	public List<employee> getAllEmployee() {
	    return employees;
	}
}
