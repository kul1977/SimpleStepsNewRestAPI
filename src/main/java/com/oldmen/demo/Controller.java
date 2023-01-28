package com.oldmen.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

@Log
@RestController
public class Controller {
	
	List<employee> employees = new ArrayList<employee>(
			Arrays.asList(
						new employee(1001, "John", "4340 Virgil Street Port St Joe FL Flori"    ,"850-227-8539", 32456),
						new employee(1002, "Bob" , "1885 Fairfield Road Milwaukee WI Wisconsin" ,"262-586-3369", 53213)						
					));
	
	@GetMapping("/employee")
	public List<employee> getAllEmployee() {
	    return employees;
	}
	
	@PostMapping("/employee")
	public boolean addEmployee(@RequestBody employee Employee) {
		
		log.info("Employee recieve : " + Employee.toString());
		
	    return true;
	}	
}
